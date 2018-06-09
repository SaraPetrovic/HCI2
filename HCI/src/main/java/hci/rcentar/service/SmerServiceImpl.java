package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hci.rcentar.domain.Smer;
import hci.rcentar.repository.SmerRepository;
@Service
public class SmerServiceImpl implements SmerService{

	@Autowired
	SmerRepository smerRepository;
	@Override
	public List<Smer> getSmers() {
		return smerRepository.findAll();
	}
	@Override
	public Smer dodajSmer(Smer smer) {
		if(smerRepository.findByOznaka(smer.getOznaka()) == null){
			return smerRepository.save(smer);
		}
		return null;
		
	}
	@Override
	public Smer findByNaziv(String naziv) {
		return smerRepository.findByNaziv(naziv);
	}
	
	@Override
	public Smer findByOznaka(String oznaka) {
		return smerRepository.findByOznaka(oznaka);
	}
	@Override
	public Boolean deleteSmer(String oznaka) {
		// TODO Auto-generated method stub
		Smer s = smerRepository.findOne(oznaka);
		if (s != null){
			smerRepository.delete(s);
			return true;
		}
		return false;
	}

	
}
