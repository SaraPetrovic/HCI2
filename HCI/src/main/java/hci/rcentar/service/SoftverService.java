package hci.rcentar.service;

import java.util.List;

import org.springframework.stereotype.Component;

import hci.rcentar.domain.Softver;

@Component
public interface SoftverService {
	public List<Softver> getSoftvers();
}
