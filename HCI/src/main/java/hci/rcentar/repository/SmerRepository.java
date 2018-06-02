package hci.rcentar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hci.rcentar.domain.Smer;

public interface SmerRepository extends JpaRepository<Smer, String> {
	
	
}
