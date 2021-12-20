package com.example;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import com.example.model.Student;
import java.util.List;
import java.util.function.Predicate;
public class UsingStreamsFilter {

			public static void printStudentsByCondition( Collection<Student> studList,Predicate<Student> condition) {
				
				studList.stream().filter(condition)
				.forEach(System.out::println);
				
			}
public static void getStudentsScoredlt80( Collection<Student> studList,Predicate<Student> condition) {
				
				studList.stream().filter(condition)
				.forEach(System.out::println);
				
			}

	public static void main(String[] args) {
		
		
		Student anand = new Student(101,"Anand",70);
		Student dhanand = new Student(102,"Dhanand",90);
		Student anu = new Student(104,"Anu",80);
		Student chandru = new Student(103,"chandru",81);
		Student ram = new Student(106,"Ram",71);
		
		ArrayList<Student> studList = new ArrayList<Student>();
		
		studList.add(anand);
		studList.add(dhanand);
		studList.add(anu);  
		studList.add(chandru);
		studList.add(ram);
		Predicate <Student> grtThan80 = student-> student.getMarkScored()>80;
		System.out.println("");
		printStudentsByCondition(studList,grtThan80);
		Predicate <Student> lstThan80 = student-> student.getMarkScored()<80;
		System.out.println("");
		getStudentsScoredlt80(studList,lstThan80);
		
		
//		studList.stream().filter((student)->student.getMarkScored()>80)
//		.forEach(System.out::println);
//		
		List<Student> listMarkScored90 =studList.stream().filter((student)->student.getMarkScored()>80).collect(toList());
		System.out.println(listMarkScored90);
		List<Student> studList1 = StudentUtil.getStudents();
	}

}
