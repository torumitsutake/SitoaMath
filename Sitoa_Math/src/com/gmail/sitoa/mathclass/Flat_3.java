package com.gmail.sitoa.mathclass;

import java.util.ArrayList;

public class Flat_3 {
	private ArrayList<Line_3> lines;
	
	public Flat_3(ArrayList<Line_3> l){
		lines =l;
	}
	
	public void setLine(Line_3 line){
		lines.add(line);
	}
	public Line_3 getLine(int i){
		
		Line_3 line = lines.get(i);
		
		return line;
	}
}
