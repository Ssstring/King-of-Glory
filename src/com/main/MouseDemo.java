package com.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo
{
    //�����ͼ������������������
    private Frame f;
    private Button bt; 
    private Button bt2; 
    
    //����
   MouseDemo()//���췽��
    {
        madeFrame();
    }
    
    public void madeFrame()
    {
        f = new Frame("My Frame");
        
        //��Frame���л������á�
        f.setBounds(700,300,240,200);//�Կ�ܵ�λ�úʹ�С��������
        f.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));//��Ʋ���
        
        bt = new Button("��ʼ��Ϸ��");
        bt2 = new Button("������Ϸ��");
        
        //�������ӵ�Frame��
        f.add(bt);
        f.add(bt2);
        
        //����һ�´����ϵ��¼�
        myEvent();
        
        //��ʾ����
        f.setVisible(true);
    }
    
    private void myEvent()
    {
        f.addWindowListener(new WindowAdapter()//���ڼ���
        {
            public void windowClosing(WindowEvent e)
            {
                System.out.println("����ִ�йرգ�");
                System.exit(0);
            }
        });

        bt.addActionListener(new ActionListener()//��ť����
        {
            public void actionPerformed(ActionEvent e)
            {
                 System.out.println("��ť��ˣ�");
            }
        });
        
        bt2.addActionListener(new ActionListener()//��ť����
        {
            public void actionPerformed(ActionEvent e)
            {
            	
                 //System.out.println("��ť��ˣ�");
            }
        });
        
        bt.addMouseListener(new MouseAdapter()//������
        {
            private int count = 1; 
            private int mouseCount = 1;
            public void mouseEntered(MouseEvent e)
            {
            	System.out.println("������!");
                //System.out.println("������"+count++);
            }
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2)
                   System.out.println("��걻˫����");
                else
                	{
                		Main m = new Main();
                		m.main(null);
                		//System.out.println("��걻���"+mouseCount++);
                	}
            }
        });
        
        bt2.addMouseListener(new MouseAdapter()//������
        {
            private int count = 1; 
            private int mouseCount = 1;
            public void mouseEntered(MouseEvent e)
            {
            	System.out.println("��Ҫ����!");
                //System.out.println("������"+count++);
            }
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2)
                   System.out.println("��걻˫����");
                else
                	{
                		System.exit(0);
                		//System.out.println("��걻���"+mouseCount++);
                	}
            }
        });
    }
    
    
    
    public static void main(String[] agrs)
    {
        new MouseDemo();
    }
}