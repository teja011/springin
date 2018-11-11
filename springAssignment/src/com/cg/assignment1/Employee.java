package com.cg.assignment1;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
    private int age;
    private SBU sbu;
	
	
	public Employee(int employeeId, String employeeName, double salary, int age, SBU sbu) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	
		this.age = age;
		this.sbu = sbu;
	}
	
	
	public SBU getSbu() {
		return sbu;
	}


	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+  ", age=" + age + ", sbu=" + sbu + "]";
	}

    
}
