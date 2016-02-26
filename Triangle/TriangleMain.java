package ney.ukr.ruslana;

public class TriangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangleOne = new Triangle(3.2, 5.0, 2.8);
		triangleOne.print();
		System.out.println(triangleOne.square());
		
		System.out.println();
		Triangle triangleTwo = new Triangle();
		triangleTwo.setA(8.1);
		triangleTwo.setB(5.7);
		triangleTwo.setC(6.4);
		triangleTwo.print();
		System.out.println(triangleTwo.square());
	}

}
