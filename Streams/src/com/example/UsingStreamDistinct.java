package com.example;

import java.util.List;
import com.example.model.Student;

public class UsingStreamDistinct {

	public static void main(String[] args) {
				
		
		List<Student> studList = StudentUtil.getStudents();
		studList.stream().distinct().forEach(System.out::println);
		

	}

}
