package com.comit.course;

public class Variable {
	public static void main(String[] args)
	{
		/*
		 comment
		 primitive datatype
		 Integer variables
		 */
		//Declaration and Initialization
		byte d=Byte.MAX_VALUE; //1byte
		short c=Short.MAX_VALUE ;//2bytes
		int a=10;//4bytes
		long b=Long.MAX_VALUE;//8bytes
	    //System.out.println(a);
		/*
		 * Decimal variable
		 */
		double e=10.456;//8 bytes;
		float f=14.454f; //4bytes;
		
		/*
		 * text variable
		 **/
		char g='A';		//2bytes;
		
		/*reference type
		 * 
		 * -nver compare reference type variable with the ==
		 * -always compare reference type variable with equal()method
		 *  1.String s=new String("hello");//standard way
		 *  2.String s="hello";
		 *  */
		String s11="hello comIT";
	  	String s1=new String("hello");
	  	String s2=new String("hello");
	  	if (s1==s2) {
	  		System.out.println("equal");
	  	}
	  	else {
	  		System.out.println("not equal");
	  	}
	  	// System.out.println((int)g);
	    
	}
}

