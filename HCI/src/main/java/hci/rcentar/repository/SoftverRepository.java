package hci.rcentar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hci.rcentar.domain.Softver;

public interface SoftverRepository extends JpaRepository<Softver, String>{

	Softver save(Softver s);
	Softver findByNaziv(String naziv);
	Softver findByOznaka(String oznaka);
}
