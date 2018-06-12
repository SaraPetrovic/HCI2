package hci.rcentar.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Termin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
    @ManyToOne(optional = false)
	private Ucionica ucionica;
    @ManyToOne(optional = false)
    private Predmet predmet;
    @Column(nullable = false)
	int startHours;
    @Column(nullable = false)
	int startMinutes;
    @Column(nullable = false)
	int endHours;
    @Column(nullable = false)
	int endMinutes;
    @Column(nullable = false)
	String dayOfWeek;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Ucionica getUcionica() {
		return ucionica;
	}
	public void setUcionica(Ucionica ucionica) {
		this.ucionica = ucionica;
	}
	public int getStartHours() {
		return startHours;
	}
	public void setStartHours(int startHours) {
		this.startHours = startHours;
	}
	public int getStartMinutes() {
		return startMinutes;
	}
	public void setStartMinutes(int startMinutes) {
		this.startMinutes = startMinutes;
	}
	public int getEndHours() {
		return endHours;
	}
	public void setEndHours(int endHours) {
		this.endHours = endHours;
	}
	public int getEndMinutes() {
		return endMinutes;
	}
	public void setEndMinutes(int endMinutes) {
		this.endMinutes = endMinutes;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public Termin(Long id, Ucionica ucionica, int startHours, int startMinutes, int endHours, int endMinutes,
			String dayOfWeek) {
		super();
		this.id = id;
		this.ucionica = ucionica;
		this.startHours = startHours;
		this.startMinutes = startMinutes;
		this.endHours = endHours;
		this.endMinutes = endMinutes;
		this.dayOfWeek = dayOfWeek;
	}
	public Termin() {
		super();
	}
	public Predmet getPredmet() {
		return predmet;
	}
	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}
	
    
    
}
