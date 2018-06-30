package com.Seleniumproject.Javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data arraylist
		
		x.add("Selenium");
		x.add(60000);
		x.add(4444.44);
		x.add(true);
		x.add(2, "Apple");
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
		
		

	}

}
