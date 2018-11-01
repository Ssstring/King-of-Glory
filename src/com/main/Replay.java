package com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Replay {
	
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:/Users/SZU/git/King-of-Glory/src/com/main/Main.java");
//		FileOutputStream out = new FileOutputStream("C:/Users/SZU/git/King-of-Glory/src/com/main/RMain.java");
		int n = 2;
		byte buffer[] = new byte[n];
		while(in.read(buffer,0,n)!=-1);
		{
			String str = new String(buffer,0,n);
//			out.write(buffer, 0, n);
			System.out.print(str);
			System.out.println("1");
		}
		System.out.println();
		in.close(); 
//		out.close();
	}
	
}
