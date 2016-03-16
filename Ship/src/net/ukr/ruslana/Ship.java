package net.ukr.ruslana;

public class Ship implements Runnable {
	private int amountCargo;
	private int unloadTime;

	public Ship(int cargo, int unloadTime) {
		super();
		this.amountCargo = cargo;
		this.unloadTime = unloadTime;
	}

	public int getAmountCargo() {
		return amountCargo;
	}

	public int getUnloadTime() {
		return unloadTime;
	}

	@Override
	public void run() {
		for (int i = 1; i <= amountCargo; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(unloadTime);
			} catch (InterruptedException e) {
				System.out.println("ERROR");
			}
		}
	}

}
