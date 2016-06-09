package euler_1;

public class Euler_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 1;
		double result2 = 1;
		for(int a=1;a<1000;a++)
		{
			for(int b=1;b<1000;b++)
			{
				result = Math.pow(a,2)+Math.pow(b,2);
				result2 = Math.pow((1000-a-b),2);
				if(a<b && b<((1000-a-b)) && result==result2 )
				{
					System.out.println(a*b*(1000-a-b));
				}
			}
		}
		
	}

}

