package com.training.book;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

BookService bs = new BookService();
System.out.println("enter id");
int bookId = sc.nextInt();
System.out.println("enter Book");
String A = sc.next();
System.out.println("enter author");
String B = sc.next();
System.out.println("enter price");
double C = sc.nextDouble();
System.out.println("enter type");
String type = sc.next();
Book book = new Book(bookId,A,B,C);
System.out.println("discount");
System.out.println(bs.discount(book));
System.out.println("customerBonus");
System.out.println(bs.calculateDiscount(book,type));
sc.close();
	}

}
