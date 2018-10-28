package com.main;


/**
 * 技能
 * @author Wang
 *
 */

public class Skill {
	/**
	 * 技能所需要的魔力值
	 */
	int needmp;    
	/**
	 * 技能所需要的冷却时间（即技能释放间隔）
	 */
	int cd;        
	/**
	 * 技能伤害
	 */
	int damage;    
	/**
	 * 技能范围
	 */
	int range;     //范围
	
	
	/**
	 * 此方法为该类的构造方法
	 * @param n 魔耗
	 * @param c 冷却
	 * @param d 伤害
	 * @param r 范围
	 */
	public Skill(int n,int c,int d,int r) 
	{
		needmp = n;
		cd = c;
		damage =d;
		range =r;
	}
}
