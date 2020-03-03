package model;

import java.io.Serializable;

public class MyDate implements Serializable {
	int d,m,y;

	public MyDate(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public MyDate(String date) {
		String[] dt=date.split("[/-]");
		this.d = Integer.parseInt(dt[0]);
		this.m = Integer.parseInt(dt[1]);
		this.y = Integer.parseInt(dt[2]);
	}
	@Override
	public String toString() {
		return d + "/" + m + "/" + y;
	}
	
}
