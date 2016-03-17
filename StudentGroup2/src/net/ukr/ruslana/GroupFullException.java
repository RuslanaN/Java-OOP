package net.ukr.ruslana;

public class GroupFullException extends Exception {
	private static final long  serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "Group is Full!";
	}

}
