package hci.rcentar.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Raspored {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(nullable = false, unique = true)
	private String naziv;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Termin> termini;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Kartica> kartice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public List<Kartica> getKartice() {
		return kartice;
	}
	public void setKartice(List<Kartica> kartice) {
		this.kartice = kartice;
	}
	
	public List<Termin> getTermini() {
		return termini;
	}
	public void setTermini(List<Termin> termini) {
		this.termini = termini;
	}
	public Raspored(Long id, String naziv, List<Kartica> kartice) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.kartice = kartice;
	}
	public Raspored() {
		super();
	}
	
	
}
