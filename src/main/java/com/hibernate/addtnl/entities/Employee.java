package com.hibernate.addtnl.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {
	@EmbeddedId
	private EmployeeComposite composite;
	private String name;
	private String city;
	public EmployeeComposite getComposite() {
		return composite;
	}
	public void setComposite(EmployeeComposite composite) {
		this.composite = composite;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [composite=" + composite + ", name=" + name + ", city=" + city + "]";
	}
}
