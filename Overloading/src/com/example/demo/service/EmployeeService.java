package com.example.demo.service;
import com.exmaple.demo.model.*;
public class EmployeeService {
 public double calculateBonus(Employee employee) {
	 return calculateBonus(employee.getSalary());
 }
 public double calculateBonus(double salary) {
	 return salary* 0.33;
 }
 public double calculateBonus(Double salary) {
	 return salary  + 1000;
 }
 public Employee updateSalary(Employee employee) {
	 double updatedSalary = employee.getSalary()+20000;
	 employee.setSalary(updatedSalary);
	 return employee;
 }
}
