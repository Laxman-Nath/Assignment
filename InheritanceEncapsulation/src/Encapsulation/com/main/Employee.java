package Encapsulation.com.main;

import java.text.NumberFormat;

public class Employee {
	private int empId;
	private String name;
	private String ssn;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public Employee(int empId, String name, String ssn, double salary) {

		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public void setName(String name) {
		if (name != null && !name.equals(""))
			this.name = name;
		else
			System.out.println("Name cannot be null");
	}

	public void raiseSalary(double salary) {
		if (salary >= 0) {
			this.salary += salary;
		} else {
			System.out.println("Please enter positive value");
		}
	}

	public void printDetails() {
		System.out.println("Id=" + this.empId);
		System.out.println("Name=" + this.name);
		System.out.println("Ssn=" + this.ssn);
		System.out.println("Salary=" + NumberFormat.getCurrencyInstance().format((double) getSalary()));

	}

	public double getSalary() {
		return this.salary;
	}
	/*
	 * public String getSsn() { return ssn; } public void setSsn(String ssn) {
	 * this.ssn = ssn; }
	 * 
	 * public void setSalary(double salary) { Salary = salary; }
	 */

}
