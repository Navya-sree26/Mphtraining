package com.mph.view;

public class MainClass 
{
	 int y=150;
	 static int z=200;
	 public void display()
	 {
		 System.out.println("no return");
		 
	 }
	 public int sum()
	 {
		 System.out.println("return method");
		 return (4+3);
	 }
	public static void main(String[] args)
	{
	System.out.println("hello world !!!");
	System.out.println("static variable:"+ z);
	 MainClass sree=new MainClass();//instance
	 System.out.println("instance var:"+sree.y);
	 sree.display();//method with no return type
	 
	 System.out.println(sree.sum());//method with return type
	 
	}
	

}
