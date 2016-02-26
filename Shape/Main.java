package net.ukr.ruslana;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr = new Triangle(new Point(1, 8), new Point(5, 7), new Point(5, 11));
		Rectangle rect = new Rectangle(new Point(2, 2), new Point(5, 2), new Point(2, 5), new Point(5, 5));
        Circle circle = new Circle(new Point(10, 3), new Point(12, 5));
        
        Board board = new Board();
        board.addShape(tr);
        board.addShape(rect);
        board.addShape(circle);
        System.out.println(board);
        System.out.println();
        board.addShape(new Circle(new Point(0, 0), new Point(3, 4)));
        System.out.println(board);
        board.addShape(new Triangle(new Point (0, 0), new Point(1, 2), new Point(5.5, 7)));
        System.out.println(board);
        
        board.delShape(2);
        System.out.println(board);
        board.delShape(4);
        System.out.println(board);
	}

}
