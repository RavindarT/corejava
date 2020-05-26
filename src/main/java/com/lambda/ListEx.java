package com.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListEx {
	
	static int cnt = 0;	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Ram", "Ravindar", 1000));
		employeeList.add(new Employee("Ram", "Rav", 500));
		employeeList.add(new Employee("Ram", "Ravi", 1000));
		employeeList.add(new Employee("Sree", "Ra", 2000));
		employeeList.add(new Employee("Sree", "Rar", 1000));
//		employeeList.add(new Employee("Sree", "Ravr", 1000));
		
		Map<String, String> unique = new HashMap<>();
		employeeList.forEach(a -> {
			unique.put(a.getManagerName(), a.getManagerName());
		});
		
		System.out.println( unique.entrySet());
		
		Set<String> set = new HashSet<>();
		employeeList.forEach( a -> {
			set.add(a.getManagerName());
		});
		System.out.println(set.toString());
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String s = i.next();
			cnt = 0;
			employeeList.stream()
				.filter( a-> {
					if(a.getManagerName().equalsIgnoreCase(s))
						return true;
					else 
						return false;
				})
				.forEach(a -> {
					cnt = cnt + a.getSalary();
				});
			
//			employeeList.stream()
//			.filter( Employee::isManager(s)	)
//			.forEach(a -> {
//				cnt = cnt + a.getSalary();
//			});
			
			System.out.println(s+":::"+cnt);
		
		}
		
	}
}


class Employee{
	String managerName;
	String employeeName;
	int salary;
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String managerName, String employeeName, int salary) {
		super();
		this.managerName = managerName;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public boolean isManager(String a) {
		return a.equalsIgnoreCase(a);
	}
}
