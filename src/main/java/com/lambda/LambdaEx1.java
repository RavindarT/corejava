package com.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.lambda.pojo.StudentPojo;
import com.lambda.pojo.Subjects;


public class LambdaEx1 {

	public static void main(String[] args) {
		
		StudentPojo studentPojo = new StudentPojo();
		studentPojo.setFirstName("Ravi");
		studentPojo.setLastName("Joseph");
		studentPojo.setRollNo(1);
		studentPojo.getSubjectList().add(new Subjects("Englist", 100));
		studentPojo.getSubjectList().add(new Subjects("Tamil", 100));
		
		StudentPojo studentPojo1 = new StudentPojo();
		studentPojo1.setFirstName("Aro");
		studentPojo1.setLastName("Joseph");
		studentPojo1.setRollNo(2);
		studentPojo1.getSubjectList().add(new Subjects("Englist", 100));
		studentPojo1.getSubjectList().add(new Subjects("Tamil", 100));
		
		
		List<StudentPojo> studentList = new ArrayList();
		studentList.add(studentPojo);
		studentList.add(studentPojo1);
		
//		System.out.println(studentList);
		
		Collections.sort(studentList, (a, b) -> a.getFirstName().compareTo(b.getLastName()) ); 
		
//		System.out.println(studentList);
		
		printConditionaly(studentList, (s) -> s.getFirstName().startsWith("R"), (s) -> System.out.println(s) );
		
		printConditionaly(studentList, (s) -> s.getFirstName().startsWith("A"), System.out::println );
		
		 studentList.stream()
		 			.filter(p -> (p.getRollNo() == 1) )
		 			.collect(Collectors.toList());
		 
		 
	}
	
	
	
	public static void printConditionaly( List<StudentPojo> studentList , Predicate<StudentPojo> condition, Consumer<StudentPojo> consumer){
		
		for(StudentPojo studentPojo : studentList) {
			if(condition.test(studentPojo)) {
				consumer.accept(studentPojo);
			}
		}
		
	}
	
	
}
