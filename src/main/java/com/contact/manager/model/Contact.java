package com.contact.manager.model;

import jakarta.persistence.*;

@Entity
@Table(name="Contactdata")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="contactid")
	private int contactid;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="officenumber")
	private String officenumber;
	@Column(name="emailid")
	private String emailid;
	@Column(name="mobileNumber")
	private String mobilenumber;
	@Column(name="city")
	private String city;
	
	@OneToOne
	@JoinColumn(name="usercontact")
	private User usercontact;
	
	@OneToOne
	@JoinColumn(name="addresscontact")
	private Address addresscontact;
	
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getOfficenumber() {
		return officenumber;
	}
	public void setOfficenumber(String officenumber) {
		this.officenumber = officenumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public User getUsercontact() {
		return usercontact;
	}
	public void setUsercontact(User usercontact) {
		this.usercontact = usercontact;
	}
	public Address getAddresscontact() {
		return addresscontact;
	}
	public void setAddresscontact(Address addresscontact) {
		this.addresscontact = addresscontact;
	}
	
	
	
	
	

}
