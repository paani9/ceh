package Cehg;



public class Cehg1 {
	static void voters()throws voterException
	{int age = 15;
	if(age>=18)
	{ 
		System.out.println("Eligible ");
		
	}
	else
	{
		throw new voterException("Not Eligible ");
	}
	}
public static void main(String[] args) 
{
	try{
		voters();
	}
	catch(voterException e)
	{
		System.out.println(e.getmsg());
	}
}
}
class voterException extends Exception
{  String msg;
public voterException(String msg)
{this.msg=msg;
}
public String getmsg()
{
	return msg;
}}

	
	
	

