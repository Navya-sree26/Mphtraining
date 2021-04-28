package com.mph.view1;

import com.mph.model.Employee;
import java.util.Scanner;
public class MainClas 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of employees:");
		int n=sc.nextInt();
		
		Employee[] emparr=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee id:-");
			int empid=sc.nextInt();
			System.out.println("Enter employee name:-");
			String empname=sc.next();
			emparr[i]=new Employee(empid,empname);
		}
		
		for(Employee j:emparr)
		{
			System.out.println(j);
		}

	}
}