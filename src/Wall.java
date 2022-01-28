
import java.awt.*;
import java.util.LinkedList;

public class Wall {

	double length;
	// different height to account for angles, such as from the roof
	double heightStart;
	double heightEnd;
	// doors so you don't have to paint them. 
	LinkedList<Door> doors = new LinkedList<Door>();
	// use windows for windows or other holes in the wall for partially seperated rooms
	LinkedList<Window> windows = new LinkedList<Window>();
	// light switches, AC units, Vents, ect.
	LinkedList<Mount> mounts = new LinkedList<Mount>();
	//used for calculating complex floor area
	Point startNode = new Point();
	Point endNode = new Point();
	

	public Wall(int inputLength, int inputHeight,Point start)
	{
		length = inputLength;
		heightStart = inputHeight;
		heightEnd = inputHeight;
		startNode = start;
		endNode = new Point(start.x + (int)length, start.y);
	}
	public Wall(int inputLength, int frontHeight,int endHeight,Point start)
	{
		length = inputLength;
		heightStart = frontHeight;
		heightEnd = endHeight;
		startNode = start;
		endNode = new Point(start.x + (int)length, start.y);
	}
	public Wall(int inputHeight,Point start,Point end)
	{
		length = start.distance(end.x,end.y);
		heightStart = inputHeight;
		heightEnd = inputHeight;
		startNode = start;
		endNode = start;
	}
	public Wall(int frontHeight,int endHeight,Point start,Point end)
	{
		length = start.distance(end.x,end.y);
		heightStart = frontHeight;
		heightEnd = endHeight;
		startNode = start;
		endNode = end;
	}
	public Wall(Wall previousWall, Point end)
	{
		heightStart = previousWall.heightEnd;
		heightEnd = heightStart;
		startNode = previousWall.endNode;
		endNode = end;
		length = startNode.distance(end.x,end.y);
	}
	public Wall(Wall previousWall,int endHeight, Point end)
	{
		heightStart = previousWall.heightEnd;
		heightEnd = endHeight;
		startNode = previousWall.endNode;
		endNode = end;
		length = startNode.distance(end.x,end.y);
	}
	
	
	public double area()
	{
		double area;
		if(heightStart == heightEnd)
		{
			area = heightStart * length;
		}
		// calculates area of angle toped walls. if top comes to a point, have both sides of the point as seperate walls.
		else
		{
			double tallerEnd;
			double shorterEnd;
			if(heightStart>heightEnd)
			{
				tallerEnd = heightStart;
				shorterEnd = heightEnd;
			}
			else
			{
				tallerEnd = heightEnd;
				shorterEnd = heightStart;
			}
			area = shorterEnd * length + (.5 * (tallerEnd-shorterEnd) * length);
		}
		//removes space that doesn't need to be painted.
		for(Door d : doors)
		{
			area -= d.area();
		}
		for(Window w : windows)
		{
			area -= w.area();
		}
		for(Mount m : mounts)
		{
			area -= m.area();
		}
		return area;
		
	}
	
	
}
