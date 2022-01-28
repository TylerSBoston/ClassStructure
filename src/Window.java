
public class Window {
	private double length;
	private double height;
	
	
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
