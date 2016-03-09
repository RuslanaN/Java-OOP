package net.ukr.ruslana;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
	private int num;
	private Thread t;

	public FactorialThread(int num) {
		super();
		this.num = num;
		this.t = new Thread(this);
		t.start();
	}

	public BigInteger factorial(int num) {
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - factorial " + this.num + " = " + this.factorial(num));

	}

}
