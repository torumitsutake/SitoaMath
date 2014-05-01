package com.gmail.sitoa.mathclass;

public class MathAPI {
	public static double kinnituD(double d,double ave)
	{
		d = d/ave;
		d = Math.ceil(d);
		d = d * ave;
		
		return d;
		
	}
}
