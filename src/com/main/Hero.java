package com.main;

/*
  * δʵ�֣�
 * 	
 * 		����Ƿ���
 * 		ħ�������ظ���2�غ�һ�㣩
 */

public class Hero {
	char name;
	int hp;      //Ѫ��
	int mp;		 //ħ��ֵ
	Skill s;	 //����
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
	
//	int check()       //���״̬���
//	{
//		if(hp>0)
//			return 1;
//		return -1;
//	}
	
}
