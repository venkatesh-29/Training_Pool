package com.example;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.model.Student;

public class UsingTerminalOperators {

	public static void main(String[] args) {

			List<Student> studList = StudentUtil.getStudents();
			Comparator<Student> markComparator = Comparator.comparing(Student::getMarkScored);
			Optional<Student> maxMark = studList.stream().max(markComparator);
			if(maxMark.isPresent()) {
				System.out.println("highest Mark:="+maxMark.get().getMarkScored());
				
			}

			Optional <Double> minMark = studList.stream()
					.map(e->e.getMarkScored())
					.min(Double::compareTo);
			if(minMark.isPresent()) {
				System.out.println("Minimum Mark:="+minMark.get());
			}
			long studScoredGt80 = studList.stream()
					.map(e->e.getMarkScored()).filter(e->e>80)
					.count();
			System.out.println("\nStudents Who Scored Greater than 80\n"+studScoredGt80);
            Map<String,Double> markList = studList.stream()
           .collect(Collectors.toMap(Student::getStudentName,Student::getMarkScored));
			Set<Map.Entry<String,Double>> map=markList.entrySet();
			for(Entry<String,Double> eachEntry: map) {
				System.out.println(eachEntry.getKey()+":"+eachEntry.getValue());
			}
			
	}

}
