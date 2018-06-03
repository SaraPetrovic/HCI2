package hci.rcentar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hci.rcentar.domain.Raspored;

public interface RasporedRepository extends JpaRepository<Raspored, Long> {
	Raspored findOneByNaziv(String naziv);
}
