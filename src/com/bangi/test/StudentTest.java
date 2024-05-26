package com.bangi.test;

import java.util.Scanner;
import com.bangi.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student student1 = new Student();
		System.out.println("Enter details of first student:");
		System.out.println("Enter roll number of student:");
		int rollnumber = scanner.nextInt();

		System.out.println("Enter name of student:");
		String name = scanner.next();

		System.out.println("Enter age of student:");
		int age = scanner.nextInt();
		System.out.println("Roll number of student is: " + rollnumber);
		System.out.println("Name of student is: " + name);
		System.out.println("Age of student is: " + age);
		System.out.println("\n");

		Student student2 = new Student();
		System.out.println("Enter details of second student:");
		System.out.println("Enter roll number of student:");
		rollnumber = scanner.nextInt();

		System.out.println("Enter name of student:");
		name = scanner.next();

		System.out.println("Enter age of student:");
		age = scanner.nextInt();

		System.out.println("Roll number of student is: " + rollnumber);
		System.out.println("Name of student is: " + name);
		System.out.println("Age of student is: " + age);

	}
}
