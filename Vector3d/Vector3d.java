package net.ukr.ruslana;

public class Vector3d {
	private double x;
	private double y;
	private double z;
	
	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public Vector3d sum(Vector3d other) {
		return new Vector3d(x + other.x, y + other.y, z + other.z);
	}
	
	public double skalar(Vector3d other) {
		return x * other.x + y * other.y + z * other.z;
	}
	
	public Vector3d multiple(Vector3d other) {
		return new Vector3d(y * other.z - z * other.y, z * other.x - x * other.z, x * other.y - other.x * y);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
