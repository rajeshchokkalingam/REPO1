package com.parack.ads.entities;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.sql.Insert;
import org.hibernate.sql.Update;

import java.util.List;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CityPK id;

	private String cityName;

	private String description;

	//bi-directional many-to-one association to State
	@ManyToOne 
	@JoinColumn(name="state_code",insertable=false, updatable=false)
	private State state;

	//bi-directional many-to-one association to Locality
	@OneToMany(mappedBy="city")
	private List<Locality> localities;

	public City() {
	}

	public CityPK getId() {
		return this.id;
	}

	public void setId(CityPK id) {
		this.id = id;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Locality> getLocalities() {
		return this.localities;
	}

	public void setLocalities(List<Locality> localities) {
		this.localities = localities;
	}

}