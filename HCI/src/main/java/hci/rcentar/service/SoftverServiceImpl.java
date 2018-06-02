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
		// TODO Auto-generated method stub
		return softverRepository.findAll();
	}
	
}
