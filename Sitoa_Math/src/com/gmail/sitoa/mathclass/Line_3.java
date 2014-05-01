package com.gmail.sitoa.mathclass;

public class Line_3 {
	
	private Point_3 fp;
	private Point_3 ep;
	
	public Line_3(Point_3 firstpoint,Point_3 endpoint){
		fp = firstpoint;
		ep = endpoint;
	}
	
	public Point_3 getfp(){
		
		return fp;
	}
	public Point_3 getep(){
		
		return ep;
	}
	
	public Point_3 getPointbyHigh(double h){
		double fpx = fp.getx();
		double fpy = fp.gety();
		double fpz = fp.getz();
		double epx = ep.getx();
		double epy = ep.gety();
		double epz = ep.getz();
		double x =0;
		double y =0;
		double z =0;
		double a = epx-fpx;
		double b = fpy-epy;
		double c = h-epy;
		double d= c/b;
		if(Double.isNaN(d)){
			d=0;
		}
		if(Double.isInfinite(d)){
			d=0;
			
		}
		x = a*d;
		x=x+fpx;
		 a = epz-fpz;
		 z = a*d;
		 z = z+fpz;
		y=h;
		
		
		Point_3 point = new Point_3(x,y,z);
		
		return point;
		
	}

}
