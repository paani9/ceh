package Cehg;
import java.util.Scanner;



public class Cehg5 {
	static void check1()throws checkException
	{
		String atm="123456789";
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter atmno");
		String y=a.next();
		
	if(atm.equals(y))
	{ 
		System.out.println("Valid");
		
	}
	else
	{
		throw new checkException("Invalid ");
	}
	}
public static void main(String[] args) 
{
	try{
	check1();
	}
	catch(checkException e)
	{
		System.out.println(e.getmsg());
	}
}
}


	
	

