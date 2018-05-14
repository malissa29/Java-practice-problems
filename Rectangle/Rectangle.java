
//package Insy.java;

//Malissa Deopras Figer
//package Insy.java;


public class Rectangle {
	int length, width;
	
	public Rectangle()
	{
		length=0;
		width=0;
	}
	
	public Rectangle(int l, int w)
	{
		length=l;
		width=w;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void setLength(int l)
	{
		length=l;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int w)
	{
		width=w;
	}

	@Override
	public String toString() {
		return "Rectangle width="+width+" length=" +length;
	}
	
	public int getArea()
	{
		return length*width;
	}
	
	public int getPerimeter()
	{
		return 2*(length+width);
	}
	
} 
