package javaStudy;

class Point implements Cloneable
{
	int _x;
	int _y;
	
	public int getX()
	{
		return _x;
	}
	
	public int getY()
	{
		return _y;
	}
	
	public Point(int x,int y)
	{
		_x = x;
		_y = y;
	}
	
	public Object clone()
	{
		Object obj = null;
		
		try
		{
			obj = super.clone();
		}catch(CloneNotSupportedException e){}
		
		return obj;
	}

};

class App
{
    public static void main(String[] args)
    {
    	Point point = new Point(10,20);
    	Point clone_point = (Point)point.clone();
    	
    	System.out.printf("x: %d y:%d",point.getX(),point.getY());
    }
}


/*

// Cloneable 을 활용한 깊은 복사

package javaStudy;


class Point implements Cloneable
{
	int _x;
	int _y;
	
	public int getX()
	{
		return _x;
	}
	
	public int getY()
	{
		return _y;
	}
	
	public void setX(int x)
	{
		_x = x;
	}
	
	public void setY(int y)
	{
		_y = y;
	}
	
	public Point(int x,int y)
	{
		_x = x;
		_y = y;
	}
	
};

class Circle implements Cloneable
{
	public Point _p;
	
	
	public Circle(Point p,double radius)
	{
		_p = p;
		_radius = radius;
	}
	
	public Circle clone()
	{
		Circle obj = null;
		
		try
		{
			obj = (Circle)super.clone();
			
		}catch(CloneNotSupportedException e){}
	
		obj._p = new Point(obj._p.getX(),obj._p.getY());
		
		return obj;
	}

	
	double _radius;
	
};

class App
{
		
    public static void main(String[] args)
    {
    	
    	Circle circle = new Circle(new Point(10,20),30);
    	Circle clone_circle = circle.clone();
    	
    	clone_circle._p.setX(30);
    	clone_circle._p.setY(40);
    	
    	System.out.printf("x:%d,y:%d",circle._p.getX(),circle._p.getY());
    	System.out.printf("x:%d,y:%d",clone_circle._p.getX(),clone_circle._p.getY());
    	
    }

}

*/