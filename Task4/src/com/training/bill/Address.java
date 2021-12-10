package com.training.bill;

public class Address {
 private int no;
 private String street;
 private String area;
 private String city;
 private int postalCode;
 public static final String district ="TamilNadu";
/**
 * 
 */
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param no
 * @param street
 * @param area
 * @param city
 * @param postalCode
 * @param district
 */
/**
 * @param no
 * @param street
 * @param area
 * @param city
 * @param postalCode
 */
public Address(int no, String street, String area, String city, int postalCode) {
	super();
	this.no = no;
	this.street = street;
	this.area = area;
	this.city = city;
	this.postalCode = postalCode;
}
/**
 * @return the no
 */
public int getNo() {
	return no;
}
/**
 * @param no the no to set
 */
public void setNo(int no) {
	this.no = no;
}
/**
 * @return the street
 */
public String getStreet() {
	return street;
}
/**
 * @param street the street to set
 */
public void setStreet(String street) {
	this.street = street;
}
/**
 * @return the area
 */
public String getArea() {
	return area;
}
/**
 * @param area the area to set
 */
public void setArea(String area) {
	this.area = area;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the postalCode
 */
public int getPostalCode() {
	return postalCode;
}
/**
 * @param postalCode the postalCode to set
 */
public void setPostalCode(int postalCode) {
	this.postalCode = postalCode;
}
/**
 * @return the district
 */
public static String getDistrict() {
	return district;
}

 
}
