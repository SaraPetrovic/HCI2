package hci.rcentar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kartica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column
	String oznaka;
	@Column(nullable = false)
	String brojTermina;
	@Column(nullable = false)
	String duration;
	
	
	
	public Kartica() {
		super();
	}
	public Kartica(String oznaka, String brojTermina, String duration) {
		super();
		this.oznaka = oznaka;
		this.brojTermina = brojTermina;
		this.duration = duration;
	}
	public String getOznaka() {
		return oznaka;
	}
	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}
	public String getBrojTermina() {
		return brojTermina;
	}
	public void setBrojTermina(String brojTermina) {
		this.brojTermina = brojTermina;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
