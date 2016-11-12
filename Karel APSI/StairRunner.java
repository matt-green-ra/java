
/** 
 * main.java
 *
 * Title:			Chapter 2
 * Description:	    Karel climbs the stairs and removes the beepers
 * @author			Debbie Klipp
 * @version			7/23/11
 */

import kareltherobot.*;

public class StairRunner implements Directions 
{

	public static void task() 
	{
	   StairSweeper karel = new StairSweeper (1,1,East,1);
	   karel.climbStair();
	   karel.climbStair();
	   karel.climbStair();
       karel.turnOff();
		
	} // task 

	// Main entry point
	public static void main(String[] args) 
     {
		World.setDelay(10);
		World.readWorld("stairs.txt");
		World.setVisible();
		task();
	}
}

