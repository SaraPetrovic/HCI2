package hci.rcentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hci.rcentar.domain.Raspored;
import hci.rcentar.repository.RasporedRepository;
@Service
public class RasporedServiceImpl implements RasporedService{

	@Autowired
	RasporedRepository repo;
	@Override
	public Raspored SaveRaspored(Raspored raspored) {
		return repo.save(raspored);
		
	}

	@Override
	public Raspored getRaspored(String naziv) {
		// TODO Auto-generated method stub
		return repo.findOneByNaziv(naziv);
	}

	@Override
	public List<Raspored> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
