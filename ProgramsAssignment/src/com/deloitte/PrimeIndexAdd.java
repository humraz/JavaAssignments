package com.deloitte;



public class PrimeIndexAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tot = 0.0;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int i = 0;
		for (int j = 0; j < 15; j++) {
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
				tot += n;
			}

		}
		System.out.println("total of all values in array at prime indices is  " +tot);
	}

}