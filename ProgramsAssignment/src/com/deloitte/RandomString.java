package com.deloitte;

import java.util.ArrayList;
import java.util.Random;

public class RandomString {
	static ArrayList<String> noun = new ArrayList();
	static ArrayList<String> verb = new ArrayList();
	static ArrayList<String> article = new ArrayList();
	static ArrayList<String> preposition = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		article.add("the");
		article.add("a");
		article.add("some");
		article.add("one");
		noun.add("boy");
		noun.add("girl");
		noun.add("dog");
		noun.add("town");
		noun.add("car");
		verb.add("drove");
		verb.add("ran");
		verb.add("jumped");
		verb.add("walked");
		verb.add("skipped");
		preposition.add("to");
		preposition.add("from");
		preposition.add("over");
		preposition.add("on");
		preposition.add("under");
		Random r= new Random();
		for(int i=0;i<15;i++)
		{
		int n= r.nextInt(4);
		int n2= r.nextInt(5);
		int n3= r.nextInt(5);

		int n4= r.nextInt(5);
		int n5= r.nextInt(4);
		int n6= r.nextInt(5);

		System.out.println(article.get(n)+ " "+ noun.get(n2)+" "+ verb.get(n3)+" "+ preposition.get(n4)+" " + article.get(n5)+" "+ noun.get(n6)+".");
		}

	}

}