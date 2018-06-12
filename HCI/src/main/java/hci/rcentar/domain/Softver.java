package hci.rcentar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Softver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String oznaka;
	@Column(nullable = false)
	private String naziv;
	@Column(nullable = false)
	private String proizvodjac;
	@Column(nullable = false)
	private String sajt;
	@Column(nullable = false)
	private int godinaIzdavanja;
	@Column(nullable = false)
	private String opis;
	@Column(nullable = false)
	private double cena;
	
	
	
	public Softver(){
		
	}
	
	public Softver(long id, String oznaka, String naziv, String proizvodjac, String sajt, int godinaIzdavanja,
			String opis, double cena) {
		super();
		this.oznaka = oznaka;
		this.naziv = naziv;
		this.proizvodjac = proizvodjac;
		this.sajt = sajt;
		this.godinaIzdavanja = godinaIzdavanja;
		this.opis = opis;
		this.cena = cena;
		this.id = id;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public String getSajt() {
		return sajt;
	}

	public void setSajt(String sajt) {
		this.sajt = sajt;
	}

	public int getGodinaIzdavanja() {
		return godinaIzdavanja;
	}

	public void setGodinaIzdavanja(int godinaIzdavanja) {
		this.godinaIzdavanja = godinaIzdavanja;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}



	public String getOznaka() {
		return oznaka;
	}

	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}
	
	
}
