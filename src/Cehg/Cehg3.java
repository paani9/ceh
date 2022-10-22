package Cehg;
import java.util.Scanner;



public class Cehg3 {
	static void check()throws checkException
	{
		String n="paavani";
		String p="Amma";
		Scanner sc=new Scanner(System.in);
		System.out.println("User name");
		String x=sc.next();
		System.out.println("password");
		String y=sc.next();
		
	if((x.equals(n))&&(y.equals(p)))
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
		check();
	}
	catch(checkException e)
	{
		System.out.println(e.getmsg());
	}
}
}
class checkException extends Exception
{ String msg;
checkException(String msg)
{this.msg=msg;
}
public String getmsg()
{
	return msg;
}
}
	
	
	

