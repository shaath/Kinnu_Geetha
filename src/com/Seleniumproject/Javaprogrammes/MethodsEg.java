package com.Seleniumproject.Javaprogrammes;

public class MethodsEg {

	public static void main(String[] args)
	{
		Function1();
		String res=Function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		
		m.Function3();
		
		boolean result=m.Function4();
		System.out.println(result);
		
//		int s=m.sum();
//		System.out.println(s);
	}
	
	//static method without returning anyvalue
	public static void Function1()
	{
		System.out.println("This is function1 code");
	}
	
	//Static method with returning value
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}

	//Non static method without returning anyvalue
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non static Method with returning value
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sum(int c, int d,int a, int b)
	{
		int e=c+d+a+b;
		return e;
	}
}
