package com.Seleniumproject.Javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		System.out.println(x.length);
		
		//Write data into an array
		x[2]="Selenium";
		x[4]=60000;
		x[2]=50000;
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}
