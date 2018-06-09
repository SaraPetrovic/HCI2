package hci.rcentar.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Ucionica {
	@Id
	String oznaka;
	@Column(nullable = false)
	String opis;
	@Column(nullable = false)
	int brojMesta;
	@Column(nullable = false)
	Boolean projektor;
	@Column(nullable = false)
	Boolean tabla;
	@Column(nullable = false)
	Boolean pametnaTabla;
	@Column(nullable = false)
	String opSistem;
	//@Enumerated(EnumType.STRING)
	//OperativniSistem opSistem;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	List<Softver> softveri;
	
	public Ucionica(){
		
	}
	
	public Ucionica(Long id, String oznaka, String opis, int brojMesta, Boolean projektor, Boolean tabla,
			Boolean pametnaTabala, String opSistem, List<Softver> softveri) {
		super();

		this.oznaka = oznaka;
		this.opis = opis;
		this.brojMesta = brojMesta;
		this.projektor = projektor;
		this.tabla = tabla;
		this.pametnaTabla = pametnaTabala;
		this.opSistem = opSistem;
		this.softveri = softveri;
	}
	public String getOznaka() {
		return oznaka;
	}
	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getBrojMesta() {
		return brojMesta;
	}
	public void setBrojMesta(int brojMesta) {
		this.brojMesta = brojMesta;
	}
	public Boolean getProjektor() {
		return projektor;
	}
	public void setProjektor(Boolean projektor) {
		this.projektor = projektor;
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
	public String getOpSistem() {
		return opSistem;
	}
	public void setOpSistem(String opSistem) {
		this.opSistem = opSistem;
	}
	public List<Softver> getSoftveri() {
		return softveri;
	}
	public void setSoftveri(List<Softver> softveri) {
		this.softveri = softveri;
	}
	
	
}
