package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Replay {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("src/com/main");
		System.out.println(f1.getPath());
		
		for(int i=0;i<f1.list().length;i++)
		{
			System.out.println(f1.list()[i]);
		}
		
		FileReader fr = new FileReader("src/com/main/1.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = null;
//		int i = 0;
		
		
		Game g = new Game();
		g.show();
		System.out.println();
		
		
		while((line=br.readLine())!=null)
		{
			
//			i++;
//			System.out.println("文件第"+i+"行："+line);
			String[] temp;
			temp = line.split(" ");
			
			/*
			for(String s:temp)
			{
				System.out.println(s);
			}
			
			System.out.println("长度："+temp.length);
			*/
			
			if(temp.length==2)
			{
				if(temp[0].equals("1"))
				{
					g.UseKill(g.a, g.b);
					g.show();
				}
				else if(temp[0].equals("2") )
				{
					g.UseKill(g.b, g.a);
					g.show();
				}
			}
			else if(temp.length==3)
			{
				if(temp[0].equals("1"))
				{
					g.move(g.a, Integer.parseInt(temp[2]));
					g.show();
				}
				else if(temp[0].equals("2"))
				{
					g.move(g.b, Integer.parseInt(temp[2]));
					g.show();
				}
			}
			
			
			
		}
		
		fr.close();
		br.close();
		
	}
	
}
