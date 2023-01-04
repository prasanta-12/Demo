package com.axis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
private String name;
//private int phone;
private int age;
private String gender;
private String type;
//private int balance=0;
//Address address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public int getNumber() {
//	return phone;
//}
//public void setNumber(int number) {
//	this.phone = number;
//}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
//public int getAmount() {
//	return balance;
//}
//public void setAmount(int balance) {
//	this.balance = balance;
//}
//public Address getAddress() {
//	return address;
//}
//public void setAddress(Address address) {
//	this.address = address;
//}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name +", age=" + age + ", gender=" + gender
			+ ", type=" + type +"]";
}


}
