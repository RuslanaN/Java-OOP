package net.ukr.ruslana;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.execute(new Ship(10, 500));
		ex.execute(new Ship(10, 500));
		ex.execute(new Ship(10, 500));
		ex.shutdown();
	}

}
