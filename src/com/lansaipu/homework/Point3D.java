package com.lansaipu.homework;

//指由长度（左右）、宽度（上下）、高度（纵深）三个因素构成的立体空间。
public class Point3D {
	double x;
	double y;
	double z;

	public Point3D(double _x, double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;
	}

	public void setX(double _x) {
		x = _x;
	}

	public void setY(double _y) {
		y = _y;
	}

	public void setZ(double _z) {
		z = _z;
	}

	public double distance1() {
		System.out.print("x的信息值为：");
		return x;
	}

	public double distance2() {
		System.out.print("y的信息值为：");
		return y;
	}

	public double distance3() {
		System.out.print("z的信息值为：");
		return z;
	}

}

