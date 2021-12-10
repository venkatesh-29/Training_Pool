package com.training;

public class Test_Greeting {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Greeting grtObj = new Greeting();
		System.out.println(grtObj.getMessage(args[2]));
		System.out.println(Greeting.print());
	}

}
