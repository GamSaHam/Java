/*
interface, defalut 키워드 이해

*/

package javaStudy;

interface IAnimer
{
	void getType();
	default void duck() {} // 인터페이스 항목은 상속받으면 모두 구현해야 하지만 default로 예외를 줄 수 있다.
}

class Dog implements IAnimer
{
	public void getType()
	{
		
		
	}
	
}


class App
{
    public static void main(String[] args)
    {
    	Dog dog = new Dog();
    	
    	System.out.print("Finish");
    }
}