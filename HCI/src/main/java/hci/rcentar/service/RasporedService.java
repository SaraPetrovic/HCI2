package hci.rcentar.service;

import java.util.List;

import org.springframework.stereotype.Component;

import hci.rcentar.domain.Raspored;

@Component
public interface RasporedService {
	Raspored SaveRaspored(Raspored raspored);
	Raspored getRaspored(String naziv);
	List<Raspored> getAll();
}
