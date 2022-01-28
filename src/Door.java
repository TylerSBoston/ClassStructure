import java.util.*;


public class Door {
	private double length;
	private double height;
	// rooms the door connects, leave second value null if it leads outside
	private Room[] connectedRooms = new Room[2]; 
	
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
