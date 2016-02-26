package net.ukr.ruslana;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double perimetr() {
		return a.distance(b) + b.distance(c) + c.distance(a);
	}

	@Override
	double area() {
		double per = this.perimetr() / 2;
		return Math.sqrt(per * (per - a.distance(b)) * (per - b.distance(c)) * (per - c.distance(a)));
	}

	@Override
	public String toString() {
		return "Triangle with points: A = " + a + ", B = " + b + ", C = " + c + "\nPerimetr = " + perimetr()
				+ "\nArea = " + area();
	}

}
