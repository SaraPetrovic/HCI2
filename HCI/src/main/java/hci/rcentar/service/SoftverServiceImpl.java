package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
