package com.example.demo;
import com.example.demo.service.*;
import com.exmaple.demo.model.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService empName = new EmployeeService();    
		Employee ram = new Employee(101,"ramesh","manager",60000);
            String[] skills = {"java","dotnet","testing","mainframe"};
            
            Manager mgr1 = new Manager(102,"suresh","Manager",75000,skills);
            Manager mgr2 = new Manager(102,"suresh","Manager",75000,skills);
            Employee[]  emplList = {mgr1,mgr2};
            
           // System.out.println(mgr.getEmployeeId());
           // System.out.println(mgr.getEmployeeName());
            System.out.println(ram);
           // for(String eachSkill: mgr.getSkillSet()) {
          //  System.out.println(eachSkill);}
            
	}
}

