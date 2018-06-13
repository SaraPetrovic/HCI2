package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hci.rcentar.domain.Softver;
import hci.rcentar.domain.Ucionica;
import hci.rcentar.repository.SoftverRepository;
import hci.rcentar.repository.UcionicaRepository;
@Service
public class UcionicaServiceImpl implements UcionicaService{

	@Autowired
	UcionicaRepository ucionicaRepository;
	@Autowired
	SoftverRepository softverRepository;
	
	@Override
	public List<Ucionica> getUcionice() {
		return ucionicaRepository.findAll();
	}
	@Override
	public Ucionica getUcionica(String oznaka) {
		return ucionicaRepository.findByOznaka(oznaka);
	}
	@Override
	public Ucionica dodajUcionicu(Ucionica u) {
		if(ucionicaRepository.findByOznaka(u.getOznaka()) == null) {
			return ucionicaRepository.save(u);	
		}
		return null;
	}
	@Override
	public Boolean deleteUcionica(long id) {
		// TODO Auto-generated method stub
		Ucionica u = ucionicaRepository.findById(id);
		if (u != null){
			ucionicaRepository.delete(u);
			return true;
		}
		
		return false;
		
	}
	@Override
	public Ucionica izmeniUcionicu(Ucionica novaUcionica) {

		Ucionica ucionica = ucionicaRepository.findById(novaUcionica.getId());
		System.out.println("UCIONICAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println(ucionica.getOznaka());
		if(!(ucionica.getOznaka().equals(novaUcionica.getOznaka()))) {
			if(ucionicaRepository.findByOznaka(novaUcionica.getOznaka()) != null) {
				return null;
			}
		}
		ucionica.setOznaka(novaUcionica.getOznaka());
		ucionica.setOpis(novaUcionica.getOpis());
		ucionica.setOpSistem(novaUcionica.getOpSistem());
		ucionica.setPametnaTabla(novaUcionica.getPametnaTabla());
		ucionica.setTabla(novaUcionica.getTabla());
		ucionica.setProjektor(novaUcionica.getProjektor());
		
		ucionica.getSoftveri().clear();
		List<Softver> softveri = novaUcionica.getSoftveri();
		for(Softver softver : softveri) {
			ucionica.addSoftver(softverRepository.findByOznaka(softver.getOznaka()));
		}
		
		ucionicaRepository.save(ucionica);
		
		return ucionica;
	}
		
}
