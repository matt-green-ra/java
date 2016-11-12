package euler_3;

public class Euler_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * divides[x_, y_] := Mod[y, x] == 0
v = 600851475143
b = 2
primes = {}
While[b != v, 
 If[divides[b, v] && PrimeQ[b], AppendTo[primes, b]; v = v/b; b = 2, 
  b++]]
AppendTo[primes, b] (*the last prime gets ignored. Add manually*)
\
Max[primes]
 */
		double v = 600851475143;
		double b = 2;
		while(b!=v)
		{
			if(v&b==0 && 
			
		}
	}

}
