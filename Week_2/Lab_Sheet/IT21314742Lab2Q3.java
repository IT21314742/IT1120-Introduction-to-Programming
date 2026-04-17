// lab2 Q3
/*
Side A = 3
SIde B = 4
Hypotenuse^2 = A^2 + B^2
Hypotenuse = √(9 + 16) = √25 = 5
*/


public class IT21314742Lab2Q3
{
	public static void main (String [] args)
	{
		//Given Values
		int sideA = 3;
		int sideB = 4;
		
		// hypotenuse = square root of (sideA + sideB)
		double hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
		
		// Display the result
		System.out.println("Length of the hypotenuse: " + hypotenuse);
	}
}