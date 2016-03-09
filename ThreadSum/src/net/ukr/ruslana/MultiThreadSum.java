package net.ukr.ruslana;

public class MultiThreadSum {
	static void sum(int[] array, int threadNumber) {
		SingleThreadSum[] threadArray = new SingleThreadSum[threadNumber];
		for (int i = 0; i < threadArray.length; i++) {
			int size = array.length / threadNumber;
			int begin = size * i;
			int end = ((i + 1) * size);
			if ((array.length - end) < size) {
				end = array.length;
			}
			threadArray[i] = new SingleThreadSum(array, begin, end);
		}
		int result = 0;
		for (int i = 0; i < threadArray.length; i++) {
			try {
				threadArray[i].getThr().join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			result += threadArray[i].getSum();
		}
		System.out.println(result);
	}
}
