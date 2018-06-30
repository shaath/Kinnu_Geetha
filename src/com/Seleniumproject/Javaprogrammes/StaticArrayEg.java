package com.Seleniumproject.Javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args)
	{
		Object[] salary={10000,20000,30000,40000,50000,60000,"Selenium",true,'H',444.44};
		
		System.out.println(salary.length);
		
		//Reading the data from an array
		
//		System.out.println(salary[2]);
		for (int i = 0; i < salary.length; i++) 
		{
			System.out.println(salary[i]);
		}
	}

}
