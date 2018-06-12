package hci.rcentar.service;

import java.util.List;

import org.springframework.stereotype.Component;

import hci.rcentar.domain.Ucionica;

@Component
public interface UcionicaService {
	public List<Ucionica> getUcionice();
	public Ucionica getUcionica(String oznaka);
	Ucionica dodajUcionicu(Ucionica u);
	public Boolean deleteUcionica(long id);
	Ucionica izmeniUcionicu(Ucionica ucionica);
}
