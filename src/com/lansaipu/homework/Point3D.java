package com.lansaipu.homework;

//ָ�ɳ��ȣ����ң�����ȣ����£����߶ȣ�����������ع��ɵ�����ռ䡣
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
		System.out.print("x����ϢֵΪ��");
		return x;
	}

	public double distance2() {
		System.out.print("y����ϢֵΪ��");
		return y;
	}

	public double distance3() {
		System.out.print("z����ϢֵΪ��");
		return z;
	}

}

