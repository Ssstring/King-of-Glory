package com.main;

/*
  * δʵ�֣�
 * 		�غ��޶��������ʱ����ÿ�غ�ֻ����һ���ƶ���һ�μ����ͷ�
 * 		��ɫ��������
 * 		ʤ�������ж���
 * 		�Ӿ�Ч����������Ϸ��֡ˢ�£������ͷŶ���
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
				System.out.println(a.name+"�ͷ��˼��ܣ�����"+b.name+"����"+b.name+"���"+a.s.damage+"���˺�");
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
				System.out.println(a.name+"�ͷ��˼��ܣ�δ����"+b.name);
				System.out.println();
			}
			else
			{
				
			}
		}
		
	}
	
	void move(Hero s,int n)    //n Ϊ����
	//1��,2��,3��,4��
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
		System.out.println("����:"+a.name+" hp:"+a.hp+" mp:"+a.mp);
		System.out.println("ħ��:"+a.s.needmp+" ��ȴ:"+a.s.cd+" ��Χ:"+a.s.range+" �˺�:"+a.s.damage);
		System.out.println();
		System.out.println("����:"+b.name+" hp:"+b.hp+" mp:"+b.mp);
		System.out.println("ħ��:"+b.s.needmp+" ��ȴ:"+b.s.cd+" ��Χ:"+b.s.range+" �˺�:"+b.s.damage);
		System.out.println();	
		System.out.println("--------------------------------------------");
	}
}
