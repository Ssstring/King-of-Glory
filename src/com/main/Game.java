package com.main;

public class Game {
	
	char [][]map = new char[9][40];
	Hero a;
	Hero b;
	Skill s1;
	Skill s2;
	Timer t;
	
	void role(Hero a,Hero b)
	{
		t.timegoby();
		
	}
	
	void move(Hero s,int n)    //n 为方向
	//-2上,-1下,1左,2右
	{
		if(n==2)
		{
			s.p.toRight();
		}
		else if(n==1)
		{
			s.p.toLeft();
		}
		else if(n==-2)
		{
			s.p.toUp();
		}
		else if(n==-1)
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
		a = new Hero('a',10,20,s1,4,0); 
		b = new Hero('b',20,20,s2,4,39);
		s1 = new Skill (5,2,6,3);
		s1 = new Skill (4,2,3,2);
		
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
		System.out.println("姓名:"+a.name+" hp:"+a.hp+" mp:"+a.mp);
		System.out.println("姓名:"+b.name+" hp:"+b.hp+" mp:"+b.mp);
		System.out.println();	
	}
}
