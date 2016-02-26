package net.ukr.ruslana;

public class Vector3dMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector3d a = new Vector3d(1, 4, -2);
		Vector3d b = new Vector3d(2, 3, -4);
		System.out.println("Vector a: " + a);
		System.out.println("Vector b: " + b);
		System.out.println("sum (a, b): " + a.sum(b));
		System.out.println("skalar (a, b): " + a.skalar(b));
		System.out.println("multiple (a, b): " + a.multiple(b));		
	}

}
