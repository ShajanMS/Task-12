package com.example.hr;


public class Employee {
	
	 private String name;
	    private int id;
	    private double salary;

	    public Employee() {
	        // Default constructor
	    }

	    public Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public void printName() {
	        System.out.println("Employee Name: " + name);
	    }

	    public void printSalary() {
	        System.out.println("Employee Salary: " + salary);
	    }
	    
	  


	public static void main(String[] args) {
		
		

	}

}
