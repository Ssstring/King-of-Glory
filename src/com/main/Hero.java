package com.main;

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
}
