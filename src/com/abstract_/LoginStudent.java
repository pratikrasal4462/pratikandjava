package com.abstract_;

public class LoginStudent extends Student{
	
	//Student class madhun
	@Override
	void loginStudent(int id)
	{
		if(id==12)
		{
			System.out.println("Login Successfull..");
		}
		else
		{
			System.out.println("Login Failed!");
		}
	}
	
	//Employee class Madhun
	@Override
	void calculateSalary()
	{
		int hours=8;
		
		int hourlySalary=200;
		
		int dailySalary=hours*hourlySalary;
		
		int monthlySalary=dailySalary*30;
		
		System.out.println("Montly Salary is : "+monthlySalary);
	}

	//Test interface Madhun
	@Override
	public void register() {
		
	}
	
	//Test2 interface madhun
	@Override
	public void check() {
		
	}
	public static void main(String[] args) {
		
		LoginStudent login=new LoginStudent();
		login.loginStudent(12);
		login.calculateSalary();
		login.register();
		
	}
}
