package com.parack.ads.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the locality database table.
 * 
 */
@Embeddable
public class LocalityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="state_code")
	private String stateCode;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="local_code")
	private String localCode;

	public LocalityPK() {
	}
	public String getStateCode() {
		return this.stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getLocalCode() {
		return this.localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LocalityPK)) {
			return false;
		}
		LocalityPK castOther = (LocalityPK)other;
		return 
			this.stateCode.equals(castOther.stateCode)
			&& this.cityCode.equals(castOther.cityCode)
			&& this.localCode.equals(castOther.localCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.stateCode.hashCode();
		hash = hash * prime + this.cityCode.hashCode();
		hash = hash * prime + this.localCode.hashCode();
		
		return hash;
	}
}