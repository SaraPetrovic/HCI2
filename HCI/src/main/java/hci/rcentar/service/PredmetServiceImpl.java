package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hci.rcentar.domain.Predmet;
import hci.rcentar.domain.Smer;
import hci.rcentar.domain.Softver;
import hci.rcentar.repository.PredmetRepository;
import hci.rcentar.repository.SmerRepository;
import hci.rcentar.repository.SoftverRepository;
@Service
public class PredmetServiceImpl implements PredmetService {

	@Autowired
	SmerRepository smerRepository;
	@Autowired
	PredmetRepository predmetRepository;
	@Autowired
	SoftverRepository softverRepository;
	
	@Override
	public Predmet getPredmet(String oznaka) {
		
		return predmetRepository.findByOznaka(oznaka);
	}
	@Override
	public List<Predmet> getPredmetsSorted() {
		return predmetRepository.findAll(new Sort(Sort.Direction.DESC, "oznaka"));
		//predmetRepository.findAllbyOrderByOznakaAsc();
	}
	@Override
	public List<Predmet> getPredmetsBySmer(String smer) {
		Smer smerFilter = smerRepository.findOne(smer);
		
		return predmetRepository.findAllBySmer(smerFilter);
	}
	@Override
	public List<Predmet> searchPredmetsByNaziv(String naziv) {
		return predmetRepository.findByNazivContainingAllIgnoringCase(naziv);
	}
	@Override
	public List<Predmet> getPredmets() {
		return predmetRepository.findAll();
	}
	@Override
	public Predmet dodajPredmet(Predmet p) {
	
		if(predmetRepository.findByOznaka(p.getOznaka()) == null) {
			return predmetRepository.save(p);
		}
		return null;	
	}
	@Override
	public Boolean deletePredmet(long id) {
		Predmet predmetToDelete = predmetRepository.findById(id);
		if (predmetToDelete != null){
			System.out.println("\n\nPredmet to delete " + predmetToDelete.getOznaka() + "\n\n");
			predmetToDelete.getSoftveri().clear();
			predmetRepository.save(predmetToDelete);
			predmetRepository.delete(predmetToDelete);
			return true;
		}
		return null;
	}
	@Override
	public Predmet izmeniPredmet(Predmet noviPredmet) {
		
		Predmet predmet = predmetRepository.findById(noviPredmet.getId());
		if(!(predmet.getOznaka().equals(noviPredmet.getOznaka()))) {
			if(predmetRepository.findByOznaka(noviPredmet.getOznaka()) != null) {
				return null;
			}
		}
		predmet.setOznaka(noviPredmet.getOznaka());
		predmet.setNaziv(noviPredmet.getNaziv());
		predmet.setBrojTermina(noviPredmet.getBrojTermina());
		predmet.setDuzinaTermina(noviPredmet.getDuzinaTermina());
		predmet.setOpis(noviPredmet.getOpis());
		predmet.setOpSistem(noviPredmet.getOpSistem());
		predmet.setPametnaTabla(noviPredmet.getPametnaTabla());
		predmet.setTabla(noviPredmet.getTabla());
		predmet.setProjektor(noviPredmet.getProjektor());
		predmet.setVelicinaGrupe(noviPredmet.getVelicinaGrupe());
		
		predmet.setSmer(smerRepository.findByOznaka(noviPredmet.getSmer().getOznaka()));
		
		predmet.getSoftveri().clear();
		List<Softver> softveri = noviPredmet.getSoftveri();
		for(Softver softver : softveri) {
			predmet.addSoftver(softverRepository.findByOznaka(softver.getOznaka()));
		}
		
		predmetRepository.save(predmet);
		
		return predmet;
	}
	
	

}
 