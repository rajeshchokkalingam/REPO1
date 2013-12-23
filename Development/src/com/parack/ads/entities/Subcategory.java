package com.parack.ads.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the subcategory database table.
 * 
 */
@Entity
public class Subcategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String subCategory_code;

	private String description;

	private String subCategoryName;

	//bi-directional many-to-one association to Brand
	@OneToMany(mappedBy="subcategory")
	private List<Brand> brands;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="Category_code")
	private Category category;

	public Subcategory() {
	}

	public String getSubCategory_code() {
		return this.subCategory_code;
	}

	public void setSubCategory_code(String subCategory_code) {
		this.subCategory_code = subCategory_code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubCategoryName() {
		return this.subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<Brand> getBrands() {
		return this.brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}