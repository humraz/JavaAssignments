package com.deloitte;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args)
{
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int tot=1;
	int n = sc.nextInt();
	for(int i=1;i<n;i++)
	{
		tot*=i;
	}
	System.out.println("Factorial is"+ tot);
}
}