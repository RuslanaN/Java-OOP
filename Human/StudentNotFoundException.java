package net.ukr.ruslana;

public class StudentNotFoundException extends Exception{
	@Override
	public String toString() {
		return "Student not found!";
	}
}
