package hci.rcentar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hci.rcentar.domain.Ucionica;

public interface UcionicaRepository extends JpaRepository<Ucionica, String> {
	Ucionica save(Ucionica u);
	Ucionica findByOznaka(String oznaka);
}
