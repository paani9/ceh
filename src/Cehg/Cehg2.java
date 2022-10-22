package Cehg;



public class Cehg2 {
	static void atm()throws atmException
	{int age = 10;
	if(age>=18)
	{ 
		System.out.println("Eligible ");
		
	}
	else
	{
		throw new atmException("Not Eligible ");
	}
	}
public static void main(String[] args) 
{
	try{
		atm();
	}
	catch(atmException e)
	{
		System.out.println(e.getmsg());
	}
}
}
class atmException extends Exception
{ String msg;
atmException(String msg)
{this.msg=msg;
}
public String getmsg()
{
	return msg;
}
}
	
	
	

