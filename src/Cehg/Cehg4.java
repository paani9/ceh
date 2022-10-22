package Cehg;



public class Cehg4{
	static void purchase()throws purchaseException
	{int shirt=4999;
	if(shirt>=5000)
	{ 
		System.out.println("500RS disc ");
		
	}
	else
	{
		throw new purchaseException("Not Eligible ");
	}
	}
public static void main(String[] args) 
{
	try{
		purchase();
	}
	catch(purchaseException e)
	{
		System.out.println(e.getmsg());
	}
}
}
class purchaseException extends Exception
{ String msg;
purchaseException(String msg)
{this.msg=msg;
}
public String getmsg()
{
	return msg;
}
}
	
	
	

