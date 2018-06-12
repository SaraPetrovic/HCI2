package hci.rcentar.service;

import java.util.List;

import org.springframework.stereotype.Component;

import hci.rcentar.domain.Softver;

@Component
public interface SoftverService {
	public List<Softver> getSoftvers();
	Softver dodajSoftver(Softver s);
	Softver findByNaziv(String naziv);
	Softver findByOznaka(String oznaka);
	public Boolean deleteSoftver(long id);
	Softver izmeniSoftver(Softver s);
}
