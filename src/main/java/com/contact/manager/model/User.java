package com.contact.manager.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.*;

@Entity
@Table(name="userdata")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userid")
	private int userid;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="emailid")
	private String emailid;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="usercontact")
	List<Contact> contactlist;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="useraddress")
	List<Address> addresslist;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public List<Contact> getContactlist() {
		return contactlist;
	}
	public void setContactlist(List<Contact> contactlist) {
		this.contactlist = contactlist;
	}
	public List<Address> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(List<Address> addresslist) {
		this.addresslist = addresslist;
	}

}
