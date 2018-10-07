package com.deloitte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSrtFile {

	public static void main(String[] args) {
		int n = 0;
		int flag= 0;
		int flag3=0;
		int t1=0;
		int t2=0;
		int t3=0;
		int flagforpreviousandnext=0;
		
		Pattern pattern = Pattern
				.compile(".*\\d{2}:\\d{2}:\\d{2},\\d{3} --> \\d{2}:\\d{2}:\\d{2},\\d{3}.*");
		Pattern number = Pattern.compile("(\\d{1})");
		Pattern text = Pattern.compile("^[a-zA-Z?!&' ]$");
		BufferedReader bw2 = null;
		File f2 = new File("myfile.srt");
		System.out.println("Reading from SRT file  "+ f2+"  And Preparing to validate the file\n");
		int previousDialogTime=0;
		int nextDialogTime=0;
		try {
			FileReader fw2 = new FileReader(f2);
			bw2 = new BufferedReader(fw2);
			String l = bw2.readLine();
String linenumber = "";
			while (l != null) {

				l = bw2.readLine();
				Matcher time = pattern.matcher(l);
				boolean timee = time.matches();
				Matcher numberr = number.matcher(l);
				boolean num=numberr.matches();
				
				if(num==true)
					
				{
					linenumber=l;
				}
				if (timee == true)

				{
					
					Pattern p1 = Pattern
							.compile("(\\d{2}:\\d{2}:\\d{2},\\d{3})");
					Pattern p2 = Pattern
							.compile("(--> \\d{2}:\\d{2}:\\d{2},\\d{3})");
					Matcher m2 = p2.matcher(l);
					if (m2.find()) {
						String t=m2.group(1).toString().replace(":","");
						t=t.replace(",","");
						t=t.replace("--> ","");
						t3=t1;
						t1=Integer.parseInt(t);

						
						if(flagforpreviousandnext==1)
						{
							flagforpreviousandnext=0;
						}
					}
					Matcher m = p1.matcher(l);
					if (m.find()){
						String t=m.group(1).toString().replace(":","");
						t=t.replace(",","");
						t2=Integer.parseInt(t);
						

						if(flagforpreviousandnext==0){
							previousDialogTime=t3;
					
							nextDialogTime=t2;
							
							flagforpreviousandnext=1;
						}
						
						System.out.print("Line Number: "+ linenumber+ " Time t2 extracted   "+ t2);
					}
					System.out.print(" .Time t1 extracted   "+ t1);
						if(t1<t2)
						{
							System.out.print(" is not Valid (The start time should be earlier than end time) Also Previous Time is " + previousDialogTime +" Next time is " +nextDialogTime);
							flag=1;

						}
						else
						{
							System.out.print(" is Valid. Also Previous Time is " + previousDialogTime +" Next time is " +nextDialogTime);

						}
				if(previousDialogTime<nextDialogTime)
					
				{
					System.out.println(" .This is Valid.");
				}
				else
				{
					flag3=1;

					System.out.println(" .This is not valid.");
				}
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(flag==1 || flag3==1)
			{
				System.out.println("\nThe file is not Valid and has invalid time");
			}
			else
			{
				System.out.println("\nthe entire file is valid and has valid time");
			}
			System.out.println("\nPS: You can test the program by changing values in the file " +f2 );
			if (bw2 != null) {
				try {
					bw2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}