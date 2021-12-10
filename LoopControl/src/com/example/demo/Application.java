package com.example.demo;
import com.exmaple.demo.model.Employee;
public class Application {

	public static void main(String[] args) {
		Employee ram = new Employee(101,"ramesh","manger",6000);
		Employee shyam = new Employee(101,"ramesh","manger",6000);
		boolean isEqual = ram.equals(shyam);
		System.out.println(""+isEqual);
		Employee onemore = ram;
		boolean iEqual = onemore.equals(shyam);
		System.out.println(""+iEqual);
	}
}
