package com.mindtree.practiceMaven;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int a=30;
       int b=20;
     int c=  add(a,b);
     int d=sub(a,b);
     System.out.println(c+" "+d);
     
    }

	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		
		return a+b;
	}
}
