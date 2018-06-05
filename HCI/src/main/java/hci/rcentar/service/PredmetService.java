package hci.rcentar.service;

import java.util.List;

import org.springframework.stereotype.Component;

import hci.rcentar.domain.Predmet;
@Component
public interface PredmetService {
	Predmet getPredmet(String oznaka);
	List<Predmet> getPredmets();
	List<Predmet> getPredmetsSorted();
	List<Predmet> getPredmetsBySmer(String smer);
	List<Predmet> searchPredmetsByNaziv(String naziv);
	Predmet dodajPredmet(Predmet p);
}
