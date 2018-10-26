package com.cg.springmvctwo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="MOBILEONEDATA")
public class Mobile {
	@Id
	@Column(name="mob_id")
	@NotNull(message="mobile ID cannot be empty")
	Integer mobId;
	@Column(name="mob_name")
	@NotEmpty(message="name cannot be empty")
	String mobName;
	@Column(name="mob_price")
	Double mobPrice;
	@Column(name="mob_catg")
	String mobCategory;
	@Column(name="mob_online")
	String mobOnline;
	
	public Mobile() {
		
	}
	
	
	public String getMobOnline() {
		return mobOnline;
	}


	public void setMobOnline(String mobOnline) {
		this.mobOnline = mobOnline;
	}


	public Integer getMobId() {
		return mobId;
	}
	public void setMobId(Integer mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public Double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(Double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getMobCategory() {
		return mobCategory;
	}
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}
	public Mobile(Integer mobId, String mobName, Double mobPrice,
			String mobCategory, String mobOnline) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.mobCategory = mobCategory;
		this.mobOnline = mobOnline;
	}


	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobName=" + mobName
				+ ", mobPrice=" + mobPrice + ", mobCategory=" + mobCategory
				+ ", mobOnline=" + mobOnline + ", getMobOnline()="
				+ getMobOnline() + ", getMobId()=" + getMobId()
				+ ", getMobName()=" + getMobName() + ", getMobPrice()="
				+ getMobPrice() + ", getMobCategory()=" + getMobCategory()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
