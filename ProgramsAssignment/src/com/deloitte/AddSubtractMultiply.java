package com.deloitte;
import java.util.Scanner;
		 
public class AddSubtractMultiply
{
    public static void main(String args[])
    {
       int a, b, res;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Two Numbers : ");
       a = scan.nextInt();
       b = scan.nextInt();
	   
       res = a + b;
       System.out.println("The Sum of "+a+ " + " +b +" =" +res);
	   
       res = a - b;
       System.out.println("After Subtraction of "+a+ " - " +b +" = " +res);
	   
       res = a * b;
       System.out.println("After multiplication of "+a+ " * " +b +" = " +res);
	   try
	   {
	       float div = (float) a / b;
	       System.out.println("After Division of "+a+ " / " +b +" = " +div);
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e.getMessage());
	   }

    }
}