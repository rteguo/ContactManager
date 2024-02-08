package com.contact.manager.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.*;

@Entity
@Table(name="Addressdata")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="addressid")
	private int adressid;
	@Column(name="block")
	private String block;
	@Column(name="area")
	private String area;
	@Column(name="city")
	private String city;
	@Column(name="zipcode")
	private double zipcode;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="useraddress")
	private User useraddress;
	
	public int getAdressid() {
		return adressid;
	}
	public void setAdressid(int adressid) {
		this.adressid = adressid;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getZipcode() {
		return zipcode;
	}
	public void setZipcode(double zipcode) {
		this.zipcode = zipcode;
	}
	public User getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(User useraddress) {
		this.useraddress = useraddress;
	}
}
