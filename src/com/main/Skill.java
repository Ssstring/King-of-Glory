package com.main;


/**
 * ����
 * @author Wang
 *
 */

public class Skill {
	/**
	 * ��������Ҫ��ħ��ֵ
	 */
	int needmp;    
	/**
	 * ��������Ҫ����ȴʱ�䣨�������ͷż����
	 */
	int cd;        
	/**
	 * �����˺�
	 */
	int damage;    
	/**
	 * ���ܷ�Χ
	 */
	int range;     //��Χ
	
	
	/**
	 * �˷���Ϊ����Ĺ��췽��
	 * @param n ħ��
	 * @param c ��ȴ
	 * @param d �˺�
	 * @param r ��Χ
	 */
	public Skill(int n,int c,int d,int r) 
	{
		needmp = n;
		cd = c;
		damage =d;
		range =r;
	}
}
