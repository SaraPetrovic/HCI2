package hci.rcentar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hci.rcentar.domain.Smer;

public interface SmerRepository extends JpaRepository<Smer, String> {
	List<Smer> findAll();
	Smer findByOznaka(String oznaka);
	Smer save(Smer s);
	void delete(Smer s);
	Smer findByNaziv(String naziv);
	
}
