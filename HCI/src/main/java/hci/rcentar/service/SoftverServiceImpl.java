package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hci.rcentar.domain.Smer;
import hci.rcentar.domain.Softver;
import hci.rcentar.repository.SoftverRepository;

@Service
public class SoftverServiceImpl implements SoftverService{

	@Autowired
	SoftverRepository softverRepository;
	@Override
	public List<Softver> getSoftvers() {
		return softverRepository.findAll();
	}
	@Override
	public Softver dodajSoftver(Softver s) {
		if(findByOznaka(s.getOznaka()) == null) {
			return softverRepository.save(s);
		}
		return null;
	}
	@Override
	public Softver findByNaziv(String naziv) {
		return softverRepository.findByNaziv(naziv);
	}
	@Override
	public Softver findByOznaka(String oznaka) {

		return softverRepository.findByOznaka(oznaka);
	}
	@Override
	public Boolean deleteSoftver(long id) {
		Softver s = softverRepository.findById(id);
		if (s != null){
			softverRepository.delete(s);
			return true;
		}
		return false;
	}
	@Override
	public Softver izmeniSoftver(Softver noviSoftver) {

		Softver softver = softverRepository.findById(noviSoftver.getId());
		if(!(softver.getOznaka().equals(noviSoftver.getOznaka()))) {
			if(softverRepository.findByOznaka(noviSoftver.getOznaka()) != null) {
				return null;
			}
		}
		softver.setOznaka(noviSoftver.getOznaka());
		softver.setNaziv(noviSoftver.getNaziv());
		softver.setOpis(noviSoftver.getOpis());
		softver.setSajt(noviSoftver.getSajt());
		softver.setGodinaIzdavanja(noviSoftver.getGodinaIzdavanja());
		softver.setCena(noviSoftver.getCena());
		softver.setProizvodjac(noviSoftver.getProizvodjac());
		
		softverRepository.save(softver);
		
		return softver;
	}
	
}
