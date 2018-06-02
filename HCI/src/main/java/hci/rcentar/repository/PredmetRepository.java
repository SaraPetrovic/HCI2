package hci.rcentar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hci.rcentar.domain.Predmet;
import hci.rcentar.domain.Smer;

public interface PredmetRepository extends JpaRepository<Predmet, String> {
	public List<Predmet> findAllBySmer(Smer smer);
	public List<Predmet> findByNazivContainingAllIgnoringCase(String naziv);
}
