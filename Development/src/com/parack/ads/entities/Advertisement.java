package com.parack.ads.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the advertisement database table.
 * 
 */
@Entity
public class Advertisement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="advt_id")
	private String advtId;

	@Column(name="advt_title")
	private String advtTitle;

	private String brand;

	private String category;

	private String createdBy;

	@Temporal(TemporalType.DATE)
	private Date createdDate;

	private String description;

	private String image;

	private byte isNegotiable;

	private String model;

	private BigInteger price;

	private String subCategory;

	@Temporal(TemporalType.DATE)
	private Date validTillDate;

	//bi-directional many-to-one association to Sellerinfo
	@ManyToOne
	@JoinColumn(name="seller_id")
	private Sellerinfo sellerinfo;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Advertisement() {
	}

	public String getAdvtId() {
		return this.advtId;
	}

	public void setAdvtId(String advtId) {
		this.advtId = advtId;
	}

	public String getAdvtTitle() {
		return this.advtTitle;
	}

	public void setAdvtTitle(String advtTitle) {
		this.advtTitle = advtTitle;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public byte getIsNegotiable() {
		return this.isNegotiable;
	}

	public void setIsNegotiable(byte isNegotiable) {
		this.isNegotiable = isNegotiable;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigInteger getPrice() {
		return this.price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public String getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public Date getValidTillDate() {
		return this.validTillDate;
	}

	public void setValidTillDate(Date validTillDate) {
		this.validTillDate = validTillDate;
	}

	public Sellerinfo getSellerinfo() {
		return this.sellerinfo;
	}

	public void setSellerinfo(Sellerinfo sellerinfo) {
		this.sellerinfo = sellerinfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}