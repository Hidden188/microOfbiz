package com.June14;

public class Lesson2 {

	static int a[] ;

	static boolean compare(int j) {
		if (j > 0 && a[j] < a[j - 1]) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[30];
		a[0] = 5;
		a[1] = 32;
		a[2] = 94;
		a[3] = 7;
		a[4] = 13;
		a[5] = 5;
		a[6] = 32;
		a[7] = 94;
		a[8] = 7;
		a[9] = 1;
		a[10] = 5;
		a[11] = 32;
		a[12] = 94;
		a[13] = 7;
		a[14] = 1;
		a[15] = 25;
		a[16] = 32;
		a[17] = 94;
		a[18] = 27;
		a[19] = 41;
		a[20] = 58;
		a[21] = 32;
		a[22] = 41;
		a[23] = 73;
		a[24] = 61;
		a[25] = 54;
		a[26] = 32;
		a[27] = 94;
		a[28] = 72;
		a[29] = 0;

		/********************** 插入排序 **************************/
		int t;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1++;
			for (int j = i; (compare(j)); j--) {
				t = a[j];
				a[j] = a[j - 1];
				a[j - 1] = t;
				sum2++;
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("比较次数" + sum1);
		System.out.println("交换次数" + sum2);
	}

}
