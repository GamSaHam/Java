/*
    @Override와 instanceof 이해

*/


package javaStudy;

class Animai
{
	public void duck()
	{
	}
}

class Dog extends Animai
{
	@Override
	public void duck()
	{
		System.out.print("Dog");
	}
}

class Cat
{
	public void duck()
	{
		System.out.print("Cat");
	}
}


class App
{
    public static void main(String[] args)
    {
    	
    	Dog dog = new Dog();
    	Cat cat = new Cat();
    	
    	dog.duck();
    	cat.duck();
    	
    	if(dog instanceof Dog)
    	{
    		System.out.print("is valued");
    	}
    		
    	if(dog instanceof Animai)
    	{
    		System.out.print("is valued");
    	}
     
    }
}