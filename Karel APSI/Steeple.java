import kareltherobot.Robot;
import kareltherobot.Directions.Direction;

public class Steeple extends Robot 
{
	// constructor
	public Steeple(int street, int avenue, Direction direction,
			int howmany) 
     {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
	public void turnRight() 
	{
		for(int i = 0; i<3; i++)
			turnLeft();
	} // turnRight
	
	public void runRace()
	{
		while(!nextToABeeper())
		{
			// not near steeple
			move();
		}
	}
	
	public void jumpSteeple()
	{
		while(!frontIsClear())
		{
			turnLeft();
			move();
			turnRight();
		}
		move();
		turnRight();
		move();
		turnLeft();
		
	}
	
} // class
