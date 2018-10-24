package com.main;

public class Main {
	public static void main(String[] args) {
		Game g = new Game();
		g.show();
		System.out.println();
		for(int i=0;i<20;i++)
		{
			g.move(g.a, 4);
			g.show();
			System.out.println();
		}
		g.move(g.a, 3);
		g.show();
		
		g.move(g.a, 1);
		g.show();
		
		g.move(g.a, 2);
		g.show();
		
		g.move(g.b, 1);
		g.show();
	}
}
