package net.ukr.ruslana;

public class SingleThreadSum implements Runnable {
	private int[] array;
	private int begin;
	private int end;
	private Thread thr;
	private int sum = 0;

	public SingleThreadSum(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		this.thr = new Thread(this);
		thr.start();

	}

	public Thread getThr() {
		return thr;
	}

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		for (int i = begin; i < end; i++) {
			sum += array[i];
		}

	}

}
