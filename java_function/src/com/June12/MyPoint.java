package com.June12;

public class MyPoint {
	private int x;
	private int y;
	private boolean f2;

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public String toString(MyPoint p) {
		return "(" + p.getX() + "," + p.getY() + ")";
	}

	public String toString(int a) {
		return "(" + a + ",0)";
	}

	public void equals() {
		this.setX(0);
		this.setY(0);
	}

	public void equals(int a) {
		this.setX(0);
		this.setY(0);
	}

	public void equals(int a, int b) {
		this.y = x;
		this.x = y;
	}

	public String toString(int a, int b) {
		return "(" + a + "," + b + ")";
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isF2() {
		return f2;
	}

	public void setF2(boolean f2) {
		this.f2 = f2;
	}

}
