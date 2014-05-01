package com.gmail.sitoa.mathclass;

public class Triangle_3 {
	private Point_3 a;
	private Point_3 b;
	private Point_3 c;
	
	public Triangle_3(Point_3 a1,Point_3 b1,Point_3 c1){
		a=a1;
		b=b1;
		c=c1;
	}
	public Point_3 getTop(){
		return a;
	}
	public Point_3 getBottom(){
		return c;
	}
	public Point_3 getMiddle(){
		return b;
	}
	
	
	
}
