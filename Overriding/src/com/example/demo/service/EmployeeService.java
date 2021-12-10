package com.example.demo.service;
import com.exmaple.demo.model.*;
public class EmployeeService extends Employee {
	private String[] emplist;

	public EmployeeService(int employeeId, String employeeName, String designation, double salary, String[]  emplList) {
		super(employeeId, employeeName, designation, salary);
		this.emplist= emplList;
	}

	public EmployeeService() {
		// TODO Auto-generated constructor stub
	super();
	}
	
}