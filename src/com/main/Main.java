package com.main;

import java.util.Scanner;

/*
  *未实现：
 * 		写好注释：做好对javadoc的支持
 */

/**
 * 主函数
 * @author WULU
 */

public class Main {
	public static void main(String[] args) {
		Game g = new Game();
		g.show();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			
			int temp = scan.nextInt();
			int temp1;
			if(temp==1)
			{
				temp1 = scan.nextInt();
				if(temp1==1)
				{
					int temp2 = scan.nextInt();
					g.move(g.a, temp2);
				}
				if(temp1==2)
				{
					g.UseKill(g.a, g.b);
				}
			}
			else if(temp==2)
			{
				temp1 = scan.nextInt();
				if(temp1==1)
				{
					int temp2 = scan.nextInt();
					g.move(g.b, temp2);
				}
				if(temp1==2)
				{
					g.UseKill(g.b, g.a);
				}
			}
			else
			{
				System.out.println("游戏结束");
				break;
			}
			g.show();
		}
		
/*
		for(int i=0;i<16;i++)
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
		
		for(int i=0;i<11;i++)
		{
			g.move(g.b, 3);
			g.show();
		}
		
		g.move(g.a, 1);
		g.show();
		
		g.UseKill(g.a, g.b);
		g.show();
		
		g.UseKill(g.b, g.a);
		g.show();
		
*/
	}
}
