package com.Seleniumproject.Javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args)
	{
		Set<Object> s=new HashSet<Object>();
		
		//Writing the data into hashset
		s.add("Selenium");
		s.add(60000);
		s.add(true);
		s.add(444.44);
		s.add("Apple");
		s.add("Selenium");
		
		Iterator<Object> it=s.iterator();
		while(it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

}
