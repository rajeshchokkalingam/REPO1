package com.parack.ads.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sellerinfo database table.
 * 
 */
@Entity
public class Sellerinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="seller_id")
	private String sellerId;

	private String city;

	private String contactName;

	private String country;

	private String cstate;

	private String email;

	private String locality;

	private String mobileNo;

	private String sellerType;

	private String sellingType;

	//bi-directional many-to-one association to Advertisement
	@OneToMany(mappedBy="sellerinfo")
	private List<Advertisement> advertisements;

	public Sellerinfo() {
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCstate() {
		return this.cstate;
	}

	public void setCstate(String cstate) {
		this.cstate = cstate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocality() {
		return this.locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSellerType() {
		return this.sellerType;
	}

	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public String getSellingType() {
		return this.sellingType;
	}

	public void setSellingType(String sellingType) {
		this.sellingType = sellingType;
	}

	public List<Advertisement> getAdvertisements() {
		return this.advertisements;
	}

	public void setAdvertisements(List<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}

}