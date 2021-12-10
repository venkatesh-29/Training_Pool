package com.exmaple.demo.model;
import static java.lang.Math.*;
public class Invoice {
 public static final int STARTNUMBER = 100;// we not able to change a constant variable
 private int invoiceNumber;//instance Variable
 private static double discount;// static variable
 public void show() //instance method
 {
	 System.out.println(invoiceNumber);
	 System.out.println(discount);
	 showAll();
 }
 public static void showAll()//static method can not able to access a non static methods
 {
	/*ystem.out.println(invoiceNumber);//static method 
	 System.out.println("discount");//static method can access only static variable.
*/System.out.println(Math.sqrt(4));
   double radian30 = toRadians(30);
   double radian60 = toRadians(60);
	 }
}
