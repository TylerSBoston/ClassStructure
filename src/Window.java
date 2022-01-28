
public class Window {
	private double length;
	private double height;
	// rooms the window connects, leave second value null if it leads outside, yes windows from room to room are allowed
	private Room[] connectedRooms = new Room[2]; 
	
	
	public Window(double inputLength)
	{
		length = inputLength; 
		height = inputLength;
	}
	public Window(double inputLength, double inputHeight)
	{
		length = inputLength; 
		height = inputHeight;
	}
	public double area()
	{
		return length * height;
	}
	
}
