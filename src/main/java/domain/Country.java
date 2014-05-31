package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	private int id;
	private String name;
	private String isoAlpha2;
	private String isoAlpha3;
	
	public Country(int id, String name, String isoAlpha2, String isoAlpha3) {
		super();
		this.id = id;
		this.name = name;
		this.isoAlpha2 = isoAlpha2;
		this.isoAlpha3 = isoAlpha3;
	}
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsoAlpha2() {
		return isoAlpha2;
	}
	public void setIsoAlpha2(String isoAlpha2) {
		this.isoAlpha2 = isoAlpha2;
	}
	public String getIsoAlpha3() {
		return isoAlpha3;
	}
	public void setIsoAlpha3(String isoAlpha3) {
		this.isoAlpha3 = isoAlpha3;
	}
}
