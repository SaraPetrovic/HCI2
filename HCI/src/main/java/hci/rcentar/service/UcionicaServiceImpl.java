package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hci.rcentar.domain.Ucionica;
import hci.rcentar.repository.UcionicaRepository;
@Service
public class UcionicaServiceImpl implements UcionicaService{

	@Autowired
	UcionicaRepository ucionicaRepository;
	
	@Override
	public List<Ucionica> getUcionice() {
		return ucionicaRepository.findAll();
	}
	@Override
	public Ucionica getUcionica(String oznaka) {
		return ucionicaRepository.findOne(oznaka);
	}
	@Override
	public Ucionica dodajUcionicu(Ucionica u) {
		if(ucionicaRepository.findByOznaka(u.getOznaka()) == null) {
			return ucionicaRepository.save(u);		
		}
		return null;
	}
	
}
