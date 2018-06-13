package hci.rcentar.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PreRemove;

@Entity
public class Predmet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	String oznaka;
	@Column(nullable = false)
	String naziv;
	@Column(nullable = false)
	String opis;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "smer_id")
	Smer smer;
	@Column(nullable = false)
	int velicinaGrupe;
	// u casovima od po 45 min
	@Column(nullable = false)
	int duzinaTermina;
	@Column(nullable = false)
	int brojTermina;
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
	@ManyToMany(fetch = FetchType.EAGER , cascade = {CascadeType.REFRESH})
	  @JoinTable(
	            name = "predmet_softver",
	            
	            joinColumns = {@JoinColumn(name = "predmet_id")},
	            inverseJoinColumns = {@JoinColumn(name = "softver_id")}
	    )
	
	List<Softver> softveri;
	@PreRemove
	private void removeGroupsFromUsers() {
		if (softveri != null){
		    //softveri.clear();
			System.out.println("\n\nUSAO U CLEAR\n\n");
		}


	}
	public Predmet(String oznaka){
		this.oznaka = oznaka;
	}
	
	public Predmet() {
		super();
	}
	
	public Predmet(long id, String oznaka, String naziv, String opis, Smer smer, int velicinaGrupe, int duzinaTermina,
			int brojTermina, Boolean projektor, Boolean tabla, Boolean pametnaTabla, String opSistem,
			List<Softver> softveri) {
		super();
		this.id = id;
		this.oznaka = oznaka;
		this.naziv = naziv;
		this.opis = opis;
		this.smer = smer;
		this.velicinaGrupe = velicinaGrupe;
		this.duzinaTermina = duzinaTermina;
		this.brojTermina = brojTermina;
		this.projektor = projektor;
		this.tabla = tabla;
		this.pametnaTabla = pametnaTabla;
		this.opSistem = opSistem;
		this.softveri = softveri;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOznaka() {
		return oznaka;
	}
	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Smer getSmer() {
		return smer;
	}
	public void setSmer(Smer smer) {
		this.smer = smer;
	}
	public int getVelicinaGrupe() {
		return velicinaGrupe;
	}
	public void setVelicinaGrupe(int velicinaGrupe) {
		this.velicinaGrupe = velicinaGrupe;
	}
	public int getDuzinaTermina() {
		return duzinaTermina;
	}
	public void setDuzinaTermina(int duzinaTermina) {
		this.duzinaTermina = duzinaTermina;
	}
	public int getBrojTermina() {
		return brojTermina;
	}
	public void setBrojTermina(int brojTermina) {
		this.brojTermina = brojTermina;
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
	public void addSoftver(Softver softver) {
		this.softveri.add(softver);
	}
	

}
