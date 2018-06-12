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
	@Column(nullable = false)
	String naziv;
	@Column(nullable = false)
	String smer;
	@Column(nullable = false)
	Boolean tabla;
	@Column(nullable = false)
	Boolean pametnaTabla;
	@Column(nullable = false)
	Boolean projektor;
	@Column(nullable = false)
	String opSistem;
	@Column(nullable = false)
	String softveri;
	@Column(nullable = false)
	int velicinaGrupe;
	public Kartica() {
		super();
	}

	








	public Kartica(Long id, String oznaka, String brojTermina, String duration, String naziv, String smer,
			Boolean tabla, Boolean pametnaTabla, Boolean projektor, String opSistem, String softveri,
			int velicinaGrupe) {
		super();
		this.id = id;
		this.oznaka = oznaka;
		this.brojTermina = brojTermina;
		this.duration = duration;
		this.naziv = naziv;
		this.smer = smer;
		this.tabla = tabla;
		this.pametnaTabla = pametnaTabla;
		this.projektor = projektor;
		this.opSistem = opSistem;
		this.softveri = softveri;
		this.velicinaGrupe = velicinaGrupe;
	}










	public int getVelicinaGrupe() {
		return velicinaGrupe;
	}





	public void setVelicinaGrupe(int velicinaGrupe) {
		this.velicinaGrupe = velicinaGrupe;
	}





	public String getSoftveri() {
		return softveri;
	}


	public void setSoftveri(String softver) {
		this.softveri = softver;
	}


	public String getOpSistem() {
		return opSistem;
	}


	public void setOpSistem(String opSistem) {
		this.opSistem = opSistem;
	}


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
	public String getSmer() {
		return smer;
	}
	public void setSmer(String smer) {
		this.smer = smer;
	}
	public Boolean getTabla() {
		return tabla;
	}
	public void setTabla(Boolean tabla) {
		this.tabla = tabla;
	}
	public Boolean getPametnaTabla() {
		return pametnaTabla;
	}
	public void setPametnaTabla(Boolean pametnaTabla) {
		this.pametnaTabla = pametnaTabla;
	}
	public Boolean getProjektor() {
		return projektor;
	}
	public void setProjektor(Boolean projektor) {
		this.projektor = projektor;
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
