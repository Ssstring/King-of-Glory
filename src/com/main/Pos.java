package com.main;

/**
 * λ��
 * @author wulu
 *
 */


public class Pos {
	/**
	 * ����
	 */
	int x;  		
	/**
	 * ����
	 */
	int y;			
	/**
	 * ���������ȡ���ڵ�ͼ��С��
	 */
	static int maxx = 9;
	/**
	 * ���������ȡ���ڵ�ͼ��С��
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
