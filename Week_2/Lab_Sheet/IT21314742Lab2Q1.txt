// lab 2 Q1
/* 
perimeter = 100
width = (3/4) x Length
Formula: Perimeter = 2 x (Length + Width)
*/

public class IT21314742Lab2Q1
{
	public static void main(String[] args)
	{
		//Given Value
		int perimeter = 100;
		double length = perimeter / 3.5;
		double width = length * 0.75;
		
		// Display the values
		System.out.println("Fence Details");
		System.out.println("Length of the Fence = " + length);
		System.out.println("Width of the Fence = " + width);
	
	}
}
