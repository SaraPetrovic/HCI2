package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hci.rcentar.domain.Predmet;
import hci.rcentar.domain.Smer;
import hci.rcentar.repository.PredmetRepository;
import hci.rcentar.repository.SmerRepository;
@Service
public class PredmetServiceImpl implements PredmetService {

	@Autowired
	SmerRepository smerRepository;
	@Autowired
	PredmetRepository predmetRepository;
	@Override
	public Predmet getPredmet(String oznaka) {
		
		return predmetRepository.findOne(oznaka);
	}
	@Override
	public List<Predmet> getPredmetsSorted() {
		// TODO Auto-generated method stub
		return predmetRepository.findAll(new Sort(Sort.Direction.DESC, "oznaka"));
		//predmetRepository.findAllbyOrderByOznakaAsc();
	}
	@Override
	public List<Predmet> getPredmetsBySmer(String smer) {
		// TODO Auto-generated method stub
		Smer smerFilter = smerRepository.findOne(smer);
		
		return predmetRepository.findAllBySmer(smerFilter);
	}
	@Override
	public List<Predmet> searchPredmetsByNaziv(String naziv) {
		// TODO Auto-generated method stub
		return predmetRepository.findByNazivContainingAllIgnoringCase(naziv);
	}
	@Override
	public List<Predmet> getPredmets() {
		// TODO Auto-generated method stub
		return predmetRepository.findAll();
	}
	@Override
	public Predmet dodajPredmet(Predmet p) {
	
		if(predmetRepository.findByOznaka(p.getOznaka()) == null) {
			return predmetRepository.save(p);
		}
		return null;	
	}
	
	

}
