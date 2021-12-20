package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Student;

public class StudentUtil {
public static List<Student> getStudents(){
	
	Student anand = new Student(101,"Anand",70);
	Student dhanand = new Student(102,"Dhanand",90);
	Student anu = new Student(104,"Anu",80);
	Student chandru = new Student(103,"chandru",82);
	Student ram = new Student(105,"ram",75);
	
	ArrayList<Student> studList = new ArrayList();
	 
	studList.add(anand);
	studList.add(dhanand);
	studList.add(anu);  
	studList.add(chandru);
	studList.add(ram);
	return studList;
}
}
