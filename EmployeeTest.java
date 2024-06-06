package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
 
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        employee.setId(id);

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);

        employee.printName();
        employee.printSalary();

        scanner.close();
		

	}

}
