package com.main;

/*
  * δʵ�֣�
 * 	
 * 		����Ƿ���
 * 		ħ�������ظ���2�غ�һ�㣩
 */

/**
 * Ӣ��
 * @author wulu
 *
 */


public class Hero {
	
	/**
	 * Ӣ�۵�����
	 */
	char name;
	/**
	 * Ӣ�۵�Ѫ��
	 */
	int hp;      
	/**
	 * Ӣ�۵�ħ��ֵ
	 */
	int mp;		 //ħ��ֵ
	/**
	 * Ӣ�۵ļ���
	 * @see Skill
	 */
	Skill s;	 //����
	/**
	 * Ӣ�۵�λ��
	 * @see Pos
	 */
	Pos p;
	/**
	 * ��ʱ��
	 * @see Timer
	 */
	Timer t;
	
	/**
	 * ����Ĺ��캯��
	 * @param n ����
	 * @param h Ѫ��
	 * @param m ħ��ֵ
	 * @param s ���� 
	 * @param x ����
	 * @param y ����
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
	
//	int check()       //���״̬���
//	{
//		if(hp>0)
//			return 1;
//		return -1;
//	}
	
}
