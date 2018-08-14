package com.cg.address;

public class Address {
private String line1;
private String line2;
private String City;
private String State;
private int pincode;
private String country;





public Address() {
}




public Address(String line1, String line2, String city, String state, int pincode, String country) {
	//super();
	this.line1 = line1;
	this.line2 = line2;
	this.City = city;
	this.State = state;
	this.pincode = pincode;
	this.country = country;
}




public String getLine1() {
	return line1;
}
public void setLine1(String line1) {
	this.line1 = line1;
}
public String getLine2() {
	return line2;
}
public void setLine2(String line2) {
	this.line2 = line2;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}

public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}




@Override
public String toString() {
	return "Address [line1=" + line1 + ", line2=" + line2 + ", City=" + City + ", State=" + State + ", pincode="
			+ pincode + ", country=" + country + "]";
}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((City == null) ? 0 : City.hashCode());
	result = prime * result + ((State == null) ? 0 : State.hashCode());
	result = prime * result + ((country == null) ? 0 : country.hashCode());
	result = prime * result + ((line1 == null) ? 0 : line1.hashCode());
	result = prime * result + ((line2 == null) ? 0 : line2.hashCode());
	result = prime * result + pincode;
	return result;
}




@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (City == null) {
		if (other.City != null)
			return false;
	} else if (!City.equals(other.City))
		return false;
	if (State == null) {
		if (other.State != null)
			return false;
	} else if (!State.equals(other.State))
		return false;
	if (country == null) {
		if (other.country != null)
			return false;
	} else if (!country.equals(other.country))
		return false;
	if (line1 == null) {
		if (other.line1 != null)
			return false;
	} else if (!line1.equals(other.line1))
		return false;
	if (line2 == null) {
		if (other.line2 != null)
			return false;
	} else if (!line2.equals(other.line2))
		return false;
	if (pincode != other.pincode)
		return false;
	return true;
}

}
