import java.awt.Point;
import java.util.*;


public class Room {

	// LinkedList to account for complex room designs
	// Class still supposed to work if the simpler room shapes and for users who place incorrect values(placing all doors/ect. on the same wall, not saying where in the room the walls are, ect.)
	private LinkedList<Wall> walls = new LinkedList<Wall>();
	private double floorArea;
	private boolean validLayout;
	
	// not all possible constructors included
	// use methods for custom wall layout
	public Room()
	{
		validLayout = false;
	}
	
	// constructor for normal layout, likely most used
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
	
	//All methods/functions bellow are incomplete but would likely be could be used in this version of room.
	
	
	//Checks if the user made a valid room if built with walls.
	public boolean validateRoom()
	{
		return false;
	}
	
	
	
	public void addWall(Wall wall)
	{
		walls.add(wall);
	}
	
	//
	public double FloorArea()
	{
		if(validateRoom())
		{
			//Some big complex math likely in its own method, only runs if there is an actual room.
			
			floorArea = floorArea; // missing local variable to update this
			return floorArea;
		}
		else
		{
			return 0.0;
		}	
	}
	
	
	// nice if user already knows or an error in validating/entering walls
	public void overrideFloorArea(double area)
	{
		floorArea = area;
	}
	
	
	
}





