package com.parack.ads.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the brand database table.
 * 
 */
@Entity
public class Brand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String brandID;

	private String brandName;

	//bi-directional many-to-one association to Subcategory
	@ManyToOne
	@JoinColumn(name="subCategory_code")
	private Subcategory subcategory;

	public Brand() {
	}

	public String getBrandID() {
		return this.brandID;
	}

	public void setBrandID(String brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Subcategory getSubcategory() {
		return this.subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

}