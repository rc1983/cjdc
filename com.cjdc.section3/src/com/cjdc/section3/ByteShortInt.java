package com.cjdc.section3;

public class ByteShortInt
{
	public static void main(String[] args)
	{
//		This is the minimum value for an integer
		int myMinValue = -2_147_483_648;
//		This is the maximunm value for an integer
		int myMaxValue = 2_147_483_647;
		
		System.out.println("Int minimum: " + myMinValue);
		System.out.println("Int maximum: " + myMaxValue);
//		This is the minimum value for a byte
		byte myByteValue = -128;
//		This is the maximum value for a short
		short myShortValue = 32767;
		
		System.out.println("Byte: " + myByteValue);
		System.out.println("Short: " + myShortValue);
	}

}
