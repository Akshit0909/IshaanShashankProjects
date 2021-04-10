package com.spring.SpringApplication;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyInjection {
	
	public static void main(String args[])
	{
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-context.xml");
		
		Country country=(Country) applicationContext.getBean("country");
		String countryname = country.getName();
		System.out.println("Name of country is" + "" + countryname);
		int population = country.getPopulation();
		System.out.println("==================================================");
		System.out.println("Population of" + countryname + " is " + " " +population);
		String language= country.getLanguage();
		System.out.println("==================================================");
		System.out.println("language of" + countryname + " is " + " " +language);
		String capitalname= country.getCapital().getName();
		System.out.println("==================================================");
		System.out.println("capital of" + countryname + " is " + " " +capitalname);
		
		Employee employee=(Employee) applicationContext.getBean("employee");
		employee.display();
		Map <String,String>m = country.getTypes();
		
		for(Map.Entry<String , String> entry : m.entrySet())
			
		{
			System.out.println("==================================================");
			System.out.println("Keys are " + entry.getKey());
			System.out.println("values are " + entry.getValue());
			
		}
		}

}
