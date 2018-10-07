
package com.deloitte;

public class SquarePrime {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(" Square of prime numbers upto 900 is ");
		for (int j = 0; j < 31; j++) {
			int flag = 0;
			int n = j;
			for (i = 2; i < (n / 2); i++)
				;
			{
				if (n % i == 0) {
					flag = 1;
				}

			}
			if (flag == 0) {
				System.out.print(" " +j * j);
			}

		}
	}
}