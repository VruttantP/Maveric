package com.java.training;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		System.out.println("Default constructor of Employee is called");
		this.empId = 0;
		this.empName = "demo";
		this.salary = 50;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, double salary) {
		System.out.println("Parameterized constructor of Employee is called");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee details are " + empId + " "+ empName + " " +salary ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
