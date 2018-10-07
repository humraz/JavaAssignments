package com.deloitte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class ArrayHash {
	public static void main(String[] args) {

		ArrayList<Integer> initial = new ArrayList<>();
		ArrayList<Integer> afteradd = new ArrayList<>();
		ArrayList<Integer> sorted = new ArrayList<>();
		ArrayList<Integer> arraykeys = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		initial.add(56);
		initial.add(45);
		initial.add(67);
		initial.add(11);
		initial.add(8);
		System.out.println("\nInput is " +initial);
		for (int i = 0; i < 5; i++) {
			int d, r = 0, tot = 0;
			int n = initial.get(i);
			while (n != 0) {
				d = n % 10;
				tot += d;
				n = n / 10;
			}
			afteradd.add(tot);
			sorted.add(tot);
		}
		Collections.sort(afteradd);
		System.out.println("\nAfter adding digits " +afteradd);
		System.out.println("\nAfter sorting "+sorted);
		for (int i = 0; i < sorted.size(); i++) {

			for (int j = 0; j < afteradd.size(); j++) {

				if (sorted.get(i) == afteradd.get(j))
					arraykeys.add(j);
			}

		}
		System.out.print("\nFinal Answer After Swapping   ");

		for (int i = 0; i < initial.size(); i++) {
			System.out.print(" " + initial.get(arraykeys.get(i)));

		}

	}
}