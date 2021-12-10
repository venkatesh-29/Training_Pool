package com.training;

public class Application {

	public static void main(String[] args) {
		Student ram = new Student();
		//can't access because its private attribute
		//System.out.println(ram.firstname);
		//can access because its a public attribute;
		System.out.println(ram.feepaid);
	}
}