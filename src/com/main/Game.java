package com.main;

public class Game {
	
	char [][]map = new char[9][40];
	Hero a;
	Hero b;
	Skill s1;
	Skill s2;
	Timer t;
	
	void role(Hero a)
	{
		t.timegoby();
	}
	

	void UseKill(Hero a)
	{
		
	}
	
	void move(Hero s,int n)    //n Ϊ����
	//1��,2��,3��,4��
	{
		
		if(n==4)
		{
			s.p.toRight();
		}
		else if(n==3)
		{
			s.p.toLeft();
		}
		else if(n==1)
		{
			s.p.toUp();
		}
		else if(n==2)
		{
			s.p.toDown();
		}
		
		
		for(int i =0;i<9;i++)
		{
			for(int j=0;j<40;j++)
			{
				if(map[i][j]==s.name)
				{
					map[i][j]='*';
					map[s.p.x][s.p.y]=s.name;
				}
			}
		}
	}
	
	Game()
	{	
		s1 = new Skill (5,2,6,3);
		s2 = new Skill (4,2,3,2);
		a = new Hero('a',10,20,s1,4,0); 
		b = new Hero('b',20,20,s2,4,39);
		
		
		for(int i =0;i<9;i++)
		{
			for(int j=0;j<40;j++)
				map[i][j]='*';
		}
		
		map[4][0]=a.name;
		map[4][39]=b.name;
	}
	
	/*
	Hero createHero(int h,int m,Skill s)
	{
		
	}
	*/
	
	
	void show()
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<40;j++)
				System.out.print(map[i][j]);
			System.out.println();
		}
		System.out.println("����:"+a.name+" hp:"+a.hp+" mp:"+a.mp);
		System.out.println("ħ��:"+a.s.needmp+" ��ȴ:"+a.s.cd+" ��Χ:"+a.s.range+" �˺�:"+a.s.damage);
		System.out.println();
		System.out.println("����:"+b.name+" hp:"+b.hp+" mp:"+b.mp);
		System.out.println("ħ��:"+b.s.needmp+" ��ȴ:"+b.s.cd+" ��Χ:"+b.s.range+" �˺�:"+b.s.damage);
		System.out.println();	
	}
}
