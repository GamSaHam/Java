package javaStudy;

class A
{
	int _value;
	
	public A(int value)
	{
		_value = value;
		
	}
};

class App
{
    public static void main(String[] args)
    {
    	A a1 = new A(10);
    	A a2 = new A(20);
    	A a3 = a1;
    	
    	if(a1.equals(a2))
    	{
    		System.out.print("a1 and a2 is same");
    	}
    	
    	if(a1.equals(a3))
    	{
    		System.out.print("a1 and a3 is same");
    	}
    }
}