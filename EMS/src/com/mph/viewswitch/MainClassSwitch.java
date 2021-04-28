package com.mph.viewswitch;
import java.io.BufferedReader;
import java.util.function.BiPredicate;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.exception.UserNotFoundException;

public class MainClassSwitch {
	
	public static void main(String[] args) throws IOException 
	{ 
		
		Scanner sc = new Scanner(System.in);
       	List  elist=null;
	    String input = null;
	    EmployeeInterface ec= new EmployeeController();
		
	    UserNotFoundException us=new UserNotFoundException();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String un,pw;
		System.out.println("Enter UserName");
		un=br.readLine();
		System.out.println("Enter password");
		pw=br.readLine();
//	if(un.equals("sree")&& pw.equals("sree"))
		
		BiPredicate<String,String> b1=(un1,pw1)->un1.equals("sree")&& pw1.equals("sree");
		if(b1.test(un,pw))
		{
		try{
			
			System.out.println("loading");
			Thread.sleep(3);
		
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
			do
		{
			System.out.println("Enter your Choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. sort Employee");
			System.out.println("4. sort with name");
			System.out.println("5.serialization");
			System.out.println("6.Deserializarion");
			System.out.println("7.insertusingprocedure");
			System.out.println("8.Meta data info");
			System.out.println("9.type_rs_forward_only");
			System.out.println("10.type_scroll_insensitive");
			System.out.println("11.type_scroll_sensitive_insert");
			System.out.println("12.type_scroll_sensitive_rs_update");
			System.out.println("13.batchupdate");
			
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1: 
			{
				//elist= ec.
						ec.addEmployee();
				break;
			}

			case 2: {
				//ec.viewEmployee(elist);
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.sortEmployee();
				break;
			}
			case 4: {
                ec.nameStart();
                break;
			}
			case 5: {
                ec.Serial();
                break;
			}
			case 6: {
                ec.Deserial();
                break;
			}
			case 7:
			{
				ec.insertUsingProc();
				break;
			}
			case 8:
			{
				ec.rsmd();
				break;
			}
			
			case 9:
			{
				ec.type_rs_forward_only();
				break;
			}
			case 10:
			{
				ec.type_scroll_insensitive_rs();
				break;
			}
			case 11:
			{
				ec.type_scroll_sensitive_rs_insert();
				break;
			}
			case 12:
			{
				ec.type_scroll_sensitive_rs_update();
				break;
			}
			case 13:
			{
				ec.batchUpdate();
			}
			default: {
                
			}
			}
			System.out.println("Do you want to continue ? Y or y for yes");
		  input = sc.next();
		} while (input.equals("Y") || input.equals("y"));
		System.out.println("System Exited..Thanks for using our system !!!");
		System.exit(0);
	}
	
		else
		{
			us.UserNotFoundException();
		}
}

}
