import java.util.*;


public class Door {
	private double length;
	private double height;
	
	public Door(double inputLength)
	{
		length = inputLength; 
		height = inputLength;
	}
	public Door(double inputLength, double inputHeight)
	{
		length = inputLength; 
		height = inputHeight;
	}
	public double area()
	{
		return length * height;
	}
}
