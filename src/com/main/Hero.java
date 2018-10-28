package com.main;

/*
  * 未实现：
 * 	
 * 		检查是否存活
 * 		魔力缓慢回复（2回合一点）
 */

/**
 * 英雄
 * @author wulu
 *
 */


public class Hero {
	
	/**
	 * 英雄的名字
	 */
	char name;
	/**
	 * 英雄的血量
	 */
	int hp;      
	/**
	 * 英雄的魔力值
	 */
	int mp;		 //魔力值
	/**
	 * 英雄的技能
	 * @see Skill
	 */
	Skill s;	 //技能
	/**
	 * 英雄的位置
	 * @see Pos
	 */
	Pos p;
	/**
	 * 计时器
	 * @see Timer
	 */
	Timer t;
	
	/**
	 * 该类的构造函数
	 * @param n 名字
	 * @param h 血量
	 * @param m 魔力值
	 * @param s 技能 
	 * @param x 行数
	 * @param y 列数
	 */
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
