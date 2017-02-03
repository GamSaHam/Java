
package javaStudy;

class App
{
	public static void tryCatchExample1()
	{
	 	try
    	{
    		int R = 100;
    		int Q = 0;
    		
    		int A = R/Q;
    	}
    	catch(ArithmeticException ae)
    	{
    		System.out.print("1."+ae.getMessage());
    	}
    	catch(Exception e)
    	{
    		System.out.print("2."+e.getMessage());
    	}
	}
	
	public static void tryCatchExample2()
	{
		try
		{
			Exception e = new Exception("Exception message");
			
			throw e;
		}catch (Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
	
    public static void main(String[] args)
    {
    	//tryCatchExample1();
    	tryCatchExample2();
    }
}