package com.example.model;
import java.util.*;
import com.example.model.*;
public class Application {

	public static void main(String[] args) {
		ArrayList<Student> studList = new ArrayList();
		Student anand = new Student(101,"Anand",70);
		Student dhanand = new Student(102,"Dhanand",90);
		Student anu = new Student(104,"Anu",80);
		Student chandru = new Student(103,"chandru",75);
		Student ram = new Student(106,"Ram",71);
		
		String rakesh = new String("Ramesh");
		 
		studList.add(anand);
		studList.add(dhanand);
		studList.add(anu);  
		studList.add(chandru);
		studList.add(ram);
		
		// cannot add other student object to the studlist since its a 
		// type safe collection of its collection of only Student
		//studList.add(rakesh);
		 
		System.out.println(studList.get(1)); 
		for(Student eachStudent : studList) {
			System.out.println(eachStudent);
		}
		//down casting  object[] to student[]
		// toArray() method return type is object[]
		//but we require a student[] array so we are doing
		//downcasting
		Student[] list = (Student[]) studList.toArray();
		System.out.println(list);
		for(Object obj:list) {
			Student stud = (Student)obj;
			System.out.println(stud.getStudentName());
		}
		Student[] studentList = {};
	}

}
