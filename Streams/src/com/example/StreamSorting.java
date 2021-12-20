package com.example;

import java.util.Comparator;
import java.util.List;

import com.example.model.Student;

public class StreamSorting {

	public static void main(String[] args) {
	
List<Student> studList = StudentUtil.getStudents();
Comparator<Student> rollComparator = Comparator.comparing(Student::getRollNumber);
Comparator<Student> nameComparator = Comparator.comparing(Student::getStudentName);			

		System.out.println("Sorted by Roll");
		studList.stream()
			.sorted(rollComparator.reversed())
			.forEach(System.out::println);
		System.out.println("");

		System.out.println("Sorted by name");
		studList.stream()
			.sorted(nameComparator)
			.forEach(System.out::println);
			
		
		
	}

}
