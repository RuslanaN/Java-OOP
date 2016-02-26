package net.ukr.ruslana;

public class Board {
	private Shape[] shapeArray = new Shape[4];
	
	public void addShape(Shape shape) {
		for (int i = 0; i < shapeArray.length; i++) {
			if (shapeArray[i] == null) {
				shapeArray[i] = shape;
				System.out.println("Shape is add!");
				return;
			}
		}
		System.out.println("Board is full!");
	}
	
	public void delShape(int cell) {
		cell -= 1;
		if (cell < 0 || cell > shapeArray.length - 1) {
			System.out.println("Wrong number cell!");
			return;
		}
		shapeArray[cell] = null;
		System.out.println("Cell is free!");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double countArea = 0;
		for (int i = 0; i < shapeArray.length; i++) {
			if (shapeArray[i] != null) {		
				countArea += shapeArray[i].area();
				sb.append((i + 1) + ") " + shapeArray[i] + "\n");
			} else {
				sb.append((i + 1) + ") " + "free" + "\n");
			}
		}
		sb.append("Total area = " + countArea + "\n");
		return sb.toString();
	}
	
	
}
