package com.CoreJava;

public class TypeCastingDemo1 {

	public static void main(String[] args) 
	{
		/*
		 * Primitive to Primitive type casting
		 * 1.Implicit
		 * 2.Explicit
		 * type should be compatible for conversion
		 * 
		 */
		
		//implicit (small size--->large size) automatic conversion (JVM)
		//byte-->short-->char-->int-->long-->float-->double
		
		byte b1=120;//-----1byte
		short s1=b1;//------2byte
		System.out.println("byte to short: "+s1);//120
		
		char ch='A';//2byte
		int i1=ch;//4byte
		
		System.out.println("char to int conversion: "+i1);//ascii value of char: 65
		
		int i2=89;//4byte
		float f1=i2;//4byte
		System.out.println("int to float conversion: "+f1);//89.0
		
		//Explicit conversion Manual conversion Casting operator(type)
		//double-->float-->long--->int--->short-->char--->byte
		float f2=56.78F;
		int i3=(int)f2;
		System.out.println("float to int conversion: "+i3);//56
		
		
		//long l1=8776557789998877L;
		long l1=6876655L;
		int i4=(int) l1;
		System.out.println("long to int data: "+i4);
		
		int i5=122;
		char c1=(char) i5;
		System.out.println("int to char conversion: "+c1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
