package com.ltts.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Checkout {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int checkid;
	private String fullname;
	private String email;
	private String Address;
	private String City;
	private int Zip;
	private String NameonCard;
	private int cardnumber;
	private int Month;
	private int Year;
	private int CVV;
	private int total;
	public int getCheckid() {
		return checkid;
	}
	public void setCheckid(int checkid) {
		this.checkid = checkid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int zip) {
		Zip = zip;
	}
	public String getNameonCard() {
		return NameonCard;
	}
	public void setNameonCard(String nameonCard) {
		NameonCard = nameonCard;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Checkout(String fullname, String email, String address, String city, int zip, String nameonCard,
			int cardnumber, int month, int year, int cVV, int total) {
		super();
		this.fullname = fullname;
		this.email = email;
		Address = address;
		City = city;
		Zip = zip;
		NameonCard = nameonCard;
		this.cardnumber = cardnumber;
		Month = month;
		Year = year;
		CVV = cVV;
		this.total = total;
	}
	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Checkout [checkid=" + checkid + ", fullname=" + fullname + ", email=" + email + ", Address=" + Address
				+ ", City=" + City + ", Zip=" + Zip + ", NameonCard=" + NameonCard + ", cardnumber=" + cardnumber
				+ ", Month=" + Month + ", Year=" + Year + ", CVV=" + CVV + ", total=" + total + "]";
	}
	
	
}
