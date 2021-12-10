package app.training;
import consume.training.*;
import emp.training.*;
import hotel.training.*;

public class Application {

	public static void main(String[] args) {
		System.out.println("CUSTOMER");
		Customer people = new Customer();
		Employee coleague = new Employee();
		Hotel competetor = new Hotel();
		
		people.setC_Name("thangaraj");
		people.setC_Phone_number(95828374);
		people.setC_Gender("Male");
		
		System.out.println(people.getC_Name());
		System.out.println(people.getC_Phone_number());
		System.out.println(people.getC_Gender());
        
		System.out.println("--------------");
        System.out.println("EMPLOYEE");
        
        coleague.setE_Id(102);
        coleague.setE_Name("PUSPARAJ");
        coleague.setE_Phone(628133681);
        coleague.setE_Salary(353762.783);
        coleague.setE_Email("venhdgs@gmail.com");
        
        System.out.println(coleague.getE_Name());
        System.out.println(coleague.getE_Phone());
        System.out.println(coleague.getE_Salary());
        System.out.println(coleague.getE_Email());
        System.out.println("--------------");
        System.out.println("HOTEL");
        
        competetor.setH_name("thalapakatti");
        competetor.setH_Address("thiruthani");
        competetor.setH_Contact(764786746);
        competetor.setH_Order("Chicken Briyani");
        
        System.out.println(competetor.getH_name());
        System.out.println(competetor.getH_Address());
        System.out.println(competetor.getH_Contact());
        System.out.println(competetor.getH_Order());
        System.out.println("--------------");
        EmployeeService col = new EmployeeService();
    	System.out.println(col.calculateBonus(coleague));
	}
}
