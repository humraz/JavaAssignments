package com.deloitte;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIdNameAgeMobile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		FileWriter fw3 = null;
		BufferedWriter bw3 = null;
		Pattern pattern = Pattern.compile("\\A[A-Z][a-zA-Z]*");
		Pattern pattern2 = Pattern.compile("//d{10}");
		Pattern pattern3 = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");
		String id = null, name,  mobile;
		id=sc.nextLine();
		Matcher matcher = pattern3.matcher(id);
		if (matcher.matches())
			System.out.println("ID is valid");
		else
			System.out.println("ID Must have format XXX-XX-XXXX");
		System.out.println("Enter Name ");
		name=sc.nextLine();
		Matcher matcher2 = pattern.matcher(name);
		if (matcher2.matches())
			System.out.println("name is valid");
		else
			System.out.println("name must start with Capital and have letters only");
		System.out.println("Enter mobile ");
		mobile=sc.nextLine();
		Matcher matcher3 = pattern2.matcher(mobile);
		if (matcher3.matches())
			System.out.println("mobile is valid");
		else
			System.out.println("mobile must have 10 digits only");
		System.out.println("Enter Age ");
		int age = sc.nextInt();
		
		if(age<18 || age>60)
		{
			System.out.println("age must be >18 and <60");
		}
		else
			System.out.println("age is valid");
		try {
			fw3= new FileWriter("myfile.txt");
			bw3=new BufferedWriter(fw3);
			bw3.write(id +", "+ name+", "+mobile +", "+ age);
			
			System.out.println("data written to File");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(bw3!=null)
		{
			try {
				bw3.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}