package com.Seleniumproject.Javaprogrammes;

public class ReuseEg {

	public static void main(String[] args) 
	{
		MethodsEg m=new MethodsEg();
		
		int x=50;
		int y=100;
		
		int res=m.sum(x,y,50,100);
		System.out.println(res);

	}

}
