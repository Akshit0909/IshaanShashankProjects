package com.spring.SpringApplication;

public class Employee {
	
	int id;
	String name;
	String grade;
	int bonus;
	String rating;
	
	public Employee(int id, String name, String grade, int bonus, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.bonus = bonus;
		this.rating = rating;
	}
	
	public Employee()
	{
		System.out.println("This is defualt Constructor");
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("==================================================");
		System.out.print("Employeee ID is " +id + " " +"Employee name is "+name);
	}
	
	
	

}
