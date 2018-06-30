package com.Seleniumproject.Javaprogrammes;

public class WhileEg {

	public static void main(String[] args) 
	{
		int i=1;
		
		while(i <= 500)
		{
			System.out.println(i);
			if (i == 200)
			{
				break;
			}
			i++;
		}

	}

}
