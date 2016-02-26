package net.ukr.ruslana;

public class Circle extends Shape{
	private Point center;
	private Point radius;
	
	public Circle(Point center, Point radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getRadius() {
		return radius;
	}

	public void setRadius(Point radius) {
		this.radius = radius;
	}

	@Override
	double perimetr() {
		return 2 * Math.PI * center.distance(radius);
	}

	@Override
	double area() {
		return Math.PI * center.distance(radius) * center.distance(radius);
	}

	@Override
	public String toString() {
		return "Circle with points: Center= " + center + ", Radius= " + radius + "\nPerimetr = " + perimetr()
		+ "\nArea = " + area();
	}
	
}
