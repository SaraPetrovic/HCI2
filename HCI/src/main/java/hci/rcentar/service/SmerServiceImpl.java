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
		// TODO Auto-generated method stub
		
		return smerRepository.findAll();
	}

}
