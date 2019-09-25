package com.June14;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 冒泡排序
		 * 
		 */
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
		/************冒泡法排序****************/
		int sum=0;
		int sum0=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) { // j的初始值是i+1
				/*
				 * i=0的时候，保证了下标0位置是0到4中的最小值 i=1的时候，保证了下标1位置是1到4中的最小值
				 */
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					sum++;
				}
				sum0++;
			}
		}
		System.out.println("比较次数"+sum0);
		System.out.println("交换次数"+sum);
		// for (int i : a) {
		// System.out.print(i+" ");//10进制
		// System.out.printf("%X\n",i+" ");//16进制
		// System.out.printf("%0\n",i+" ");//8进制

		/**************** 选择排序 ******************/
		int t;
		int sum2=0;
		int sum3=0;
		for (int i = 0; i < a.length; i++) {
			int lindex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[lindex]) {
					lindex = j;
				}
				sum3++;
			}
			sum2++;
			t=a[i];
			a[i]=a[lindex];
			a[lindex]=t;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("比较次数"+sum3);
		System.out.println("交换次数"+sum2);

		
	}

}