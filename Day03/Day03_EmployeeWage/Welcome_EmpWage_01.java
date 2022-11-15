package com.Day03_EmployeeWage;

public class Welcome_EmpWage_01 
{
	String EmpName="Swapnil Kadam";
	int sal;
	String Department= "Account";
	
	public void Sal()
	{
		System.out.println("Salary=50,000" + sal);
	}
	public void Department()
	{
		System.out.println("Your Department = " + Department );
	}
	
	
	public static void main(String[] args) 
	{
		Welcome_EmpWage_01 emp=new Welcome_EmpWage_01();
		System.out.println("Hello... "+ emp.EmpName + " Welcome to Employee Wage Computation Program.");
		emp.Department();
		emp.Sal();
	}

}
