package com.Seleniumproject.Javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];
		
		System.out.println("The number of rows: "+x.length);
		
		System.out.println("The number of columns for 0th indexed row: "+x[0].length);
		
		//Writing the data into an array
		
		x[0][1]="Selenium";
		x[1][2]=60000;
		
		//Reading the data from an array
		
//		System.out.println(x[0][1]);
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
		
		
	}

}
