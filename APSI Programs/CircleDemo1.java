import java.util.Scanner;

public class CircleDemo1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		double r,d,a,c;
		final double pi = 3.14;
		
		System.out.println("Please enter the radius of the circle");
		r = in.nextDouble();
		d = 2*r;
		a = pi*r*r;
		c = 2*pi*r;
		
		System.out.println("Diameter: "+ d);
		System.out.println("Area: "+ a);	
		System.out.println("Circumference: "+ c);
		
		
	}

}
