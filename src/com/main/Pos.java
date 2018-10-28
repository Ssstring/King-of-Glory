package com.main;

/**
 * 位置
 * @author wulu
 *
 */


public class Pos {
	/**
	 * 行数
	 */
	int x;  		
	/**
	 * 列数
	 */
	int y;			
	/**
	 * 最大行数（取决于地图大小）
	 */
	static int maxx = 9;
	/**
	 * 最大列数（取决于地图大小）
	 */
	static int maxy = 25;
	
	
	public Pos(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	
	void toLeft()
	{
		if(y-1>=0)
			y=y-1;
		
	}
	
	void toRight()
	{
		if(y+1<maxy)
			y=y+1;
	}
	
	void toUp()
	{
		if(x-1>=0)
			x=x-1;
	}
	
	void toDown()
	{
		if(x+1<maxx)
			x=x+1;
	}
}
