package com.main;

/*
  * 未实现：
 * 		回合限定：加入计时器，每回合只允许一次移动和一次技能释放
 * 		角色的死亡：
 * 		胜利条件判定：
 * 		视觉效果升级：游戏安帧刷新，技能释放动画
 */

public class Game {
	
	char [][]map = new char[9][25];
	Hero a;
	Hero b;
	Skill s1;
	Skill s2;
	Timer t;
	
	void role(Hero a)
	{
		t.timegoby();
	}
	

	void UseKill(Hero a,Hero b)
	{
		int r = a.s.range;
		int isInRange = 0;
		int leftIndex,rightIndex,upIndex,downIndex;
		
		if(a.p.x-r<=0)
			upIndex = 0;
		else 
			upIndex = a.p.x - r;
		
		if(a.p.x+r>=Pos.maxx)
			downIndex = Pos.maxx - 1;
		else 
			downIndex = a.p.x + r;
		
		if(a.p.y-r<=0)
			leftIndex = 0;
		else 
			leftIndex = a.p.y - r;
		
		if(a.p.y+r>=Pos.maxy)
			rightIndex = Pos.maxy - 1;
		else 
			rightIndex = a.p.y + r;
		
		for(int i =upIndex;i<=downIndex;i++)
		{
			
			for(int j = leftIndex;j<=rightIndex;j++)
			{
				System.out.print(map[i][j]+" ");
				if(map[i][j]==b.name)
				{
					isInRange = 1;
				}
			}
			System.out.println();
		}
			
//		System.out.println(isInRange);
		
		if(isInRange==1)
		{
			if(a.mp-a.s.needmp>=0)
			{
				a.mp = a.mp - a.s.needmp;
				b.hp = b.hp - a.s.damage;
				System.out.println(a.name+"释放了技能，命中"+b.name+"，对"+b.name+"造成"+a.s.damage+"点伤害");
				System.out.println();
			}
			else
			{
				
			}
		}
		else
		{
			if(a.mp-a.s.needmp>=0)
			{
				a.mp = a.mp - a.s.needmp;
				System.out.println(a.name+"释放了技能，未命中"+b.name);
				System.out.println();
			}
			else
			{
				
			}
		}
		
	}
	
	void move(Hero s,int n)    //n 为方向
	//1上,2下,3左,4右
	{
		char temp;
		if(n==4)
		{
			if(map[s.p.x][s.p.y+1]=='*')
				s.p.toRight();
		}
		else if(n==3)
		{
			if(map[s.p.x][s.p.y-1]=='*')
				s.p.toLeft();
		}
		else if(n==1)
		{
			if(map[s.p.x-1][s.p.y]=='*')
				s.p.toUp();
		}
		else if(n==2)
		{
			if(map[s.p.x+1][s.p.y]=='*')
				s.p.toDown();
		}
		
		
		for(int i =0;i<Pos.maxx;i++)
		{
			for(int j=0;j<Pos.maxy;j++)
			{
				if(map[i][j]==s.name)
				{
					
					temp = map[i][j];
					map[i][j]=map[s.p.x][s.p.y];
					map[s.p.x][s.p.y]=temp;
					
				}
			}
		}
	}
	
	Game()
	{	
		s1 = new Skill (5,2,6,3);
		s2 = new Skill (4,2,3,2);
		a = new Hero('a',10,20,s1,4,0); 
		b = new Hero('b',20,20,s2,4,Pos.maxy-1);
		
		
		for(int i =0;i<Pos.maxx;i++)
		{
			for(int j=0;j<Pos.maxy;j++)
				map[i][j]='*';
		}
		
		map[4][0]=a.name;
		map[4][Pos.maxy-1]=b.name;
	}
	
	/*
	Hero createHero(int h,int m,Skill s)
	{
		
	}
	*/
	
	
	void show()
	{
		for(int i=0;i<Pos.maxx;i++)
		{
			for(int j=0;j<Pos.maxy;j++)
				System.out.print(map[i][j]+" ");
			System.out.println();
		}
		System.out.println("姓名:"+a.name+" hp:"+a.hp+" mp:"+a.mp);
		System.out.println("魔耗:"+a.s.needmp+" 冷却:"+a.s.cd+" 范围:"+a.s.range+" 伤害:"+a.s.damage);
		System.out.println();
		System.out.println("姓名:"+b.name+" hp:"+b.hp+" mp:"+b.mp);
		System.out.println("魔耗:"+b.s.needmp+" 冷却:"+b.s.cd+" 范围:"+b.s.range+" 伤害:"+b.s.damage);
		System.out.println();	
		System.out.println("--------------------------------------------");
	}
}
