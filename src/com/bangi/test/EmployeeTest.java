package com.bangi.test;

import java.util.Scanner;
import com.bangi.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee1 = new Employee();

		System.out.println("Enter details of first employee : ");
		System.out.println("Enter id of employee : ");
		int id = scanner.nextInt();
		employee1.setId(id);

		System.out.println("Enter name of employee : ");
		String name = scanner.next();
		employee1.setName(name);

		System.out.println("Enter salary of employee : ");
		double salary = scanner.nextDouble();
		employee1.setSalary(salary);

		System.out.println("Id of employee is: " + employee1.getId());
		System.out.println("Name of employee is: " + employee1.getName());
		System.out.println("Salary of employee is: " + employee1.getSalary());
		System.out.println("\n");

		Employee employee2 = new Employee();

		System.out.println("Enter details of second employee : ");
		System.out.println("Enter id of employee : ");
		id = scanner.nextInt();
		employee2.setId(id);

		System.out.println("Enter name of employee : ");
		name = scanner.next();
		employee2.setName(name);

		System.out.println("Enter salary of employee : ");
		salary = scanner.nextDouble();
		employee2.setSalary(salary);

		System.out.println("Id of employee is: " + employee1.getId());
		System.out.println("Name of employee is: " + employee1.getName());
		System.out.println("Salary of employee is: " + employee1.getSalary());
		System.out.println("\n");
	}
}
