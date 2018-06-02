package hci.rcentar.service;

import java.util.List;

import org.springframework.stereotype.Component;

import hci.rcentar.domain.Smer;
@Component
public interface SmerService {
	List<Smer> getSmers();
}
