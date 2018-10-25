package com.main;

/*
  * 未实现：
 * 	
 * 		检查是否存活
 * 		魔力缓慢回复（2回合一点）
 */

public class Hero {
	char name;
	int hp;      //血量
	int mp;		 //魔力值
	Skill s;	 //技能
	Pos p;
	Timer t;
	
	public Hero(char n,int h,int m,Skill s,int x,int y) 
	{
		name = n;
		hp = h;
		mp = m;
		this.s = s;
		p = new Pos(x,y);
		t = new Timer();
	}
	
//	int check()       //存活状态检查
//	{
//		if(hp>0)
//			return 1;
//		return -1;
//	}
	
}
