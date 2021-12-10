package com.example.demo;
import java.util.Scanner;
import com.example.demo.service.EmployeeService;
import com.exmaple.demo.model.Employee;

public class Application {

	public static void main(String[] args) {
		int employeeId= Integer.parseInt(args[0]);
		String employeeName = args[1];
		String designation =args[2];
		double salary = Double.parseDouble(args[3]);
		
		Employee shyam = new Employee(101,"Rajesh","manger",60000);
		Employee ram = new Employee(102,"Ramesh","manger",15000);
		
		Scanner vc = new Scanner(System.in);
		System.out.println("enter ID");
		int id = vc.nextInt();
		System.out.println("enter name");
		String name = vc.next();
		System.out.println("enter desig");
		String desig = vc.next();
		System.out.println("enter salary");
		double salary5 = vc.nextDouble();
		
		vc.close();
		EmployeeService service = new EmployeeService();
		
		System.out.println("Expected: 4950 => Actual:="+ service.calculateBonus(ram));
		System.out.println("Expected: 19800 => Actual:="+service.calculateBonus(shyam.getSalary()));
		
		Double salary2= Double.valueOf(15000);
		int intSalary2 = (int)(salary2.doubleValue());
		double salary3 = salary2.doubleValue();
		int salary4 = (int)salary3;
		
		System.out.println("Expected:16000 =>Actual:="+service.calculateBonus(salary2));
		Employee rakesh = new Employee(103,"Rakesh","manger",70000);
		
		System.out.println("Before "+rakesh.getSalary());
		service.updateSalary(rakesh);
		System.out.println("After "+rakesh.getSalary());
		System.out.println("Expected: 90000 =>Actual:="+rakesh.getSalary());
	}

}
