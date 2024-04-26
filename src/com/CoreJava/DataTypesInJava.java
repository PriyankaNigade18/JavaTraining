package com.CoreJava;

public class DataTypesInJava {

	public static void main(String[] args)
	{
		//Boolean true=1/false=0 1bit
		boolean status=true;
		System.out.println("Boolean data is: "+status);//true
		status=false;
		System.out.println("Updated data is: "+status);//false
		
		boolean newStatus=false;
		System.out.println("New status is: "+newStatus);//false
	
		System.out.println("***********************************");
		
		//Numeric--->character 
		/*
		 * character char 2byte
		 * 1. Single character
		 * 2. Special character 
		 * 3. ASCII values also
		 * 
		 *  A-Z= 65 to 90
		 *  a-z= 97 to 122
		 *  0 to 9= 48 to 57
		 */
	
		char c1='A';
		System.out.println("Single charcater is: "+c1);//A
		
		char c2='#';
		System.out.println("Special character is: "+c2);//#
		
		
		char c3=97;//here 97 is ascii for character a
		System.out.println("Character for ascii 97:"+c3);//a
		
		System.out.println("***********************");
		//Numeric--->Integral--->Integers & floating point
		
		/* Integers
		 * byte-->short-->int--->long
		 * 
		 * byte 1byte
		 * short 2byte
		 * int 4byte (any number in java by default its int type)
		 * long 8byte
		 * 
		 */
		
		//byte 1byte -128 to 127
		byte b1=-128;
		byte b2=127;
		
		//Type mismatch: cannot convert from int to byte
		//byte b3=130;
		System.out.println("byte data is: "+b1+" : "+b2);
		//short 2byte -32768 to 32767
		short s1=130;
		short s2=32000;
		short s3=-32768;
		short s4=32767;
		//Type mismatch: cannot convert from int to short
		//short s5=32768;
		
		System.out.println("Short data is: "+s1+" : "+s2+" : "+s3+" : "+s4);
		
		//int 4byte
		int i1=87653679;
		System.out.println("Int data is: "+i1);
		//The literal 9999999999 of type int is out of range 
		//int i2=9999999999;
		
		//long 8byte (suffix L/l)
		long l1=9999999999L;
		System.out.println("long data is: "+l1);
		
		System.out.println("**********Floating point number************* ");
		
		/*
		 * float 4byte [after decimal 7 to 8 digit ]
		 * double 8byte (default)[after 15 to 16 decimal digit]
		 */
		
		double d1=67.89;
		System.out.println("Double type: "+d1);
		
		//Type mismatch: cannot convert from double to float
		float f1=89.66F;
		System.out.println("Float type: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
