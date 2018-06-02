package hci.rcentar.service;

import java.util.List;

import org.springframework.stereotype.Component;

import hci.rcentar.domain.Ucionica;

@Component
public interface UcionicaService {
	public List<Ucionica> getUcionice();
}
