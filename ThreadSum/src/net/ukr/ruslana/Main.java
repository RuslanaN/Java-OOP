package net.ukr.ruslana;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[200000];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}
		
		long tStart = System.currentTimeMillis();
		System.out.println(sum(array));
		long tEnd = System.currentTimeMillis();
		System.out.println((tEnd - tStart) + " ms" + " - simple sum");

		long tStart2 = System.currentTimeMillis();
		MultiThreadSum.sum(array, 3);
		long tEnd2 = System.currentTimeMillis();
		System.out.println((tEnd2 - tStart2) + " ms" + " - multi sum");
	}
	
	static long sum(int[] array) {
		long res = 0;
		for (int i = 0; i < array.length; i++) {
			res += array[i];
		}
		return res;
	}

}
