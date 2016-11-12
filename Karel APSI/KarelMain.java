
/** 
 * main.java
 *
 * Title:			
 * Description:	    
 * @author			
 * @version			
 */

import kareltherobot.*;

public class KarelMain implements Directions 
{

	public static void task() 
	{
		UrRobot karel = new UrRobot (1,1,East,1);


           karel.turnOff();
		
	} // task 

	// Main entry point
	public static void main(String[] args) 
     {
		World.setDelay(50);
		World.readWorld("oneBeeper.TXT");
		World.setVisible();
		task();
	}
}

