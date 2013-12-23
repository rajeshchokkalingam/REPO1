package com.parack.ads.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the locality database table.
 * 
 */
@Entity
public class Locality implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LocalityPK id;

	private String description;

	private String locationName;

	//bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="city_code", referencedColumnName="city_code",insertable = false, updatable = false),
		@JoinColumn(name="state_code", referencedColumnName="state_code",insertable = false, updatable = false),
		})
	private City city;

	public Locality() {
	}

	public LocalityPK getId() {
		return this.id;
	}

	public void setId(LocalityPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}