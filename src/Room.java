import java.awt.Point;
import java.util.*;


public class Room {

	// LinkedList to account for complex room designs
	private LinkedList<Wall> walls = new LinkedList<Wall>();
	private double floorArea;
	private boolean validLayout;
	
	
	// use methods for custom wall layout
	public Room()
	{
		validLayout = false;
	}
	
	// constructor for basic room layout
	public Room(int length, int width, int height)
	{
		validLayout = true;
		floorArea = width*length;
		walls.add(new Wall(height, new Point(0,0), new Point(length,0)));
		walls.add(new Wall(height, new Point(length,0), new Point(length,width)));
		walls.add(new Wall(height, new Point(width,length), new Point(0,width)));
		walls.add(new Wall(height, new Point(0,width), new Point(0,0)));
	}
	
	public double wallArea()
	{
		double total=0;
		for(Wall wall : walls)
		{
			total += wall.area();
		}
		return total;
		
	}
	
	
	
	
	
	
}





