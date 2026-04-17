// lab 2 Q2
/*
Square side = 10
First make square fence (rope length = perimeter of square)
use same rope to make circle
Find circle radius
*/

public class IT21314742Lab2Q2
{public static void main (String [] args)
	{
		//Given Values
		int squareSide = 10;
		double PI = 3.14;
		
		// Calculate perimeter of square
		double ropeLength = 4 * squareSide;
		
		// circumference = 2 * PI * radius
		// radius = circumference / (2 * PI)
		double radius = ropeLength / (2 * PI);
		
		// Display the results
		System.out.println("Square side: "+ squareSide);
		System.out.println("Rope length(Perimeter): " + ropeLength);
		System.out.println("Radius of circular fence: " + radius);
	}
}
	

