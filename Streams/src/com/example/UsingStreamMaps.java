package com.example;
import java.util.stream.*;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;
import com.example.model.Student;

public class UsingStreamMaps {

	public static void main(String[] args) {
	List<Student> studList = StudentUtil.getStudents();
	
	Function<Student,String> mapCondition = e->e.getStudentName();
	
	List<String> nameList = studList.stream().map(e->e.getStudentName())
			.collect(toList());
System.out.println(nameList);
List<String> nameGrt90 = studList.stream().filter(e->e.getMarkScored()<80).map(mapCondition).collect(toList());

System.out.println(nameGrt90);
	}

}
