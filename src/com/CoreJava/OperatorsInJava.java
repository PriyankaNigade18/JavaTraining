package com.CoreJava;

public class OperatorsInJava {

	public static void main(String[] args)
	{
	System.out.println("Assignment operator = ");
	
	int a=10,b=5;
	System.out.println("a="+a+" & b="+b);
	System.out.println("Arithemetic operators");
	System.out.println("Addition is: "+(a+b));
	System.out.println("Subtraction is: "+(a-b));
	System.out.println("Division is: "+(a/b));
	System.out.println("Multiplication is: "+(a*b));
	System.out.println("Modulus is: "+(a%b));
	/*
	 * Increment ++                  Decrement --
	 *  a=10  a++ = a=a+1                      
	 * postIncrement
	 * a++ 
	 * PreIncrement
	 * ++a
	 */
	
	System.out.println("a="+a);//10
	System.out.println(a++);//10
	System.out.println(a);//11
	
//	int a1=100;
//	int b1=a1++;
//	System.out.println(a1);//101
//	System.out.println(b1);//100
	
//	int a1=100;
//	a1++;
//	int b1=a1;
//	System.out.println(a1);
//	System.out.println(b1);
	
	
	int c=89;
	int d=c++;
	
	System.out.println(d);//89
	System.out.println(c);//90
	
	
	System.out.println(c);//90
	System.out.println(++c);//91
	
	int c1=48;
	int c2=++c1;
	System.out.println(c1);//49
	System.out.println(c2);//49
	
	int i=695;
	int j=++i;
	System.out.println(i);//696
	System.out.println(j);//696
	
	/*
	 * Decrement
	 * a-- = a=a-1 post
	 * --a  = pre decrement
	 */
	
	int x=59;
	System.out.println(x);//59
	System.out.println(x--);//59
	System.out.println(x);//58
	
	System.out.println(--x);//57
	
	
	int p=33;
	int q=p--;
	
	System.out.println(p);//32
	System.out.println(q);//33
	
	
	int r=90;
	int k=--r;
	
	System.out.println(r);//89
	System.out.println(k);//89
	System.out.println("*************************");
	System.out.println("*****Relational operators***********");
	//r=k=89 x=57 p=32 q=33 c1=c2=49
	System.out.println("Greater than >: "+(k>c1));//true
	System.out.println("Less than <"+(p<r));//true
	System.out.println(">= greater tahn equal to: "+(c1>=c2));//true
	System.out.println(x>=k);//false
	System.out.println("<= less than equal to: "+(c1<=r));//true
	System.out.println(k<=q);//false
	System.out.println("Comparison operator ==: "+(r==k));//true
	System.out.println(p==q);//false
	
	//Not equal to(!=)
	System.out.println(p!=q);//true
	System.out.println(r!=k);//false
	
	System.out.println("**********Logical Operators************");
	
	// Not operator(!)
		System.out.println(r==k);//true
		System.out.println(!(r==k));//false
		
		/*
		 *   a      b 		  AND a && b    OR a||b
		 *   true   true       true           true
		 *   true   false      false          true
		 *   false  true       false          true
		 *   false  false	   false          false
		 * 
		 */
	
	System.out.println(p!=q && c1==c2);//true
	System.out.println(c1==c2 && r!=k);//false
	System.out.println(r>k && c1==c2);//false
	System.out.println(r!=k && p>q);//false
	
	
	System.out.println(p!=q || c1==c2);//true
	System.out.println(c1==c2 || r!=k);//true
	System.out.println(r>k || c1==c2);//true
	System.out.println(r!=k || p>q);//false
	
	System.out.println("*****ternary operator (conditional operator)*****");
	
	//conditional statement
	int v=90, u=890;
	if(v>u)
	{
		System.out.println(v+" is greater than "+u);
	}else
	{
		System.out.println(u+" is greater than "+v);
		
	}
	
	
	System.out.println("******* condition?true:false *********");
	
	System.out.println(v>u?v+" is greater than "+u:u+" is greater than "+v);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
