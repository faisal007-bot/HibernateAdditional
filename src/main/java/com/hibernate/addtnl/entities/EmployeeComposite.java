package com.hibernate.addtnl.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class EmployeeComposite implements Serializable{
	private int employeeId;
	private int companyId;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "EmployeeComposite [employeeId=" + employeeId + ", companyId=" + companyId + "]";
	}
}
