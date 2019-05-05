package com.cjdc.section3.opearators;

public class Operators
{

	public static void main(String[] args)
	{
		double result = 100;
		
		System.out.println(result);
		
		//return what is left over after the division
		result = result % 3;
		
		System.out.println(result);
		
		result += 10;
		
		System.out.println(result);
		
		result /= 6;
		
		System.out.println(result);
		
		boolean isAlien = false;
		
		if (isAlien == true)
		{
			System.out.println("Not");
		}
		else
		{
			System.out.println("yes");
		}
		
		int newValue = 50;
		
		if (newValue == 50)
		{
			System.out.println("This is an error");
		}
		
		boolean isCar = false;
		
		//whatever isCar returns
		if(isCar)
		{
			System.out.println("This is not supposed to happen");
		}
		
		//ternary operators
		int tTest = 10;
		/**
		 * result = testCondition ? value1 : value2
		 * If testCondition is true, assign the value of value1 to result;
		 * otherwise, assign the value of value2 to result.
		 */
		
		int a = 3,
			b = 4;
		
		int c = (a > b) ? a : b;
		
		System.out.println("c = " + c);
		
		boolean wasCar = isCar ? true : false;
		if(wasCar)
		{
			System.out.println("wasCar = " + wasCar);
		}
		
		double v1 = 20d;
		double v2 = 80d;
		
		double result1 = (v1 + v2)*25;
		System.out.println("Result = " + result1);
		
		double Mod = result1 % 40;
		System.out.println("Mod = " + Mod);
		
		if (Mod <= 20)
		{
			System.out.println("Over the limit");
		}
	}
}
