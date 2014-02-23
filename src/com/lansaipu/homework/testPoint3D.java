package com.lansaipu.homework;

public class testPoint3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("三维坐标信息显示如下：");
		Point3D p = new Point3D(0, 0, 0);
		p.setX(1.0);
		p.setY(2.0);
		p.setZ(3.0);
		System.out.println(p.distance1());
		System.out.println(p.distance2());
		System.out.println(p.distance3());
	}

}
