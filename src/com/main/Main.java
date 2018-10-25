package com.main;

/*
  *未实现：
 * 		写好注释：做好对javadoc的支持
 */

public class Main {
	public static void main(String[] args) {
		Game g = new Game();
		g.show();
		System.out.println();
		for(int i=0;i<20;i++)
		{
			g.move(g.a, 4);
			g.show();
		}
		g.move(g.a, 3);
		g.show();
		
		g.move(g.a, 1);
		g.show();
		
		g.move(g.a, 2);
		g.show();
		
		g.move(g.b, 1);
		g.show();
		
		g.move(g.b, 2);
		g.show();
		
		for(int i=0;i<17;i++)
		{
			g.move(g.b, 3);
			g.show();
		}
		
		g.UseKill(g.a, g.b);
		g.show();
		
		g.UseKill(g.b, g.a);
		g.show();
	}
}
