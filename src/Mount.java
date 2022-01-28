
public class Mount {
	private double length;
	private double height;
	
	// optional
	private String mountType;

	
	public void Mount(double inputLength)
	{
		length = inputLength; 
		height = inputLength;
	}
	public void Mount(double inputLength, double inputHeight)
	{
		length = inputLength; 
		height = inputHeight;
	}
	public void Mount(double inputLength, String type)
	{
		length = inputLength; 
		height = inputLength;
		mountType = type;
	}
	public void Mount(double inputLength, double inputHeight,String type)
	{
		length = inputLength; 
		height = inputHeight;
		mountType = type;
	}
	
	public double area()
	{
		return length * height;
	}
	
	
}
