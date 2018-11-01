package com.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo
{
    //定义该图形中所需的组件的引用
    private Frame f;
    private Button bt; 
    private Button bt2; 
    
    //方法
   MouseDemo()//构造方法
    {
        madeFrame();
    }
    
    public void madeFrame()
    {
        f = new Frame("My Frame");
        
        //对Frame进行基本设置。
        f.setBounds(700,300,240,200);//对框架的位置和大小进行设置
        f.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));//设计布局
        
        bt = new Button("开始游戏！");
        bt2 = new Button("结束游戏！");
        
        //将组件添加到Frame中
        f.add(bt);
        f.add(bt2);
        
        //加载一下窗体上的事件
        myEvent();
        
        //显示窗体
        f.setVisible(true);
    }
    
    private void myEvent()
    {
        f.addWindowListener(new WindowAdapter()//窗口监听
        {
            public void windowClosing(WindowEvent e)
            {
                System.out.println("窗体执行关闭！");
                System.exit(0);
            }
        });

        bt.addActionListener(new ActionListener()//按钮监听
        {
            public void actionPerformed(ActionEvent e)
            {
                 System.out.println("按钮活动了！");
            }
        });
        
        bt2.addActionListener(new ActionListener()//按钮监听
        {
            public void actionPerformed(ActionEvent e)
            {
            	
                 //System.out.println("按钮活动了！");
            }
        });
        
        bt.addMouseListener(new MouseAdapter()//鼠标监听
        {
            private int count = 1; 
            private int mouseCount = 1;
            public void mouseEntered(MouseEvent e)
            {
            	System.out.println("快点击吧!");
                //System.out.println("鼠标监听"+count++);
            }
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2)
                   System.out.println("鼠标被双击了");
                else
                	{
                		Main m = new Main();
                		m.main(null);
                		//System.out.println("鼠标被点击"+mouseCount++);
                	}
            }
        });
        
        bt2.addMouseListener(new MouseAdapter()//鼠标监听
        {
            private int count = 1; 
            private int mouseCount = 1;
            public void mouseEntered(MouseEvent e)
            {
            	System.out.println("不要点我!");
                //System.out.println("鼠标监听"+count++);
            }
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2)
                   System.out.println("鼠标被双击了");
                else
                	{
                		System.exit(0);
                		//System.out.println("鼠标被点击"+mouseCount++);
                	}
            }
        });
    }
    
    
    
    public static void main(String[] agrs)
    {
        new MouseDemo();
    }
}