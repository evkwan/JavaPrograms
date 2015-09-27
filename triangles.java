/*****************
* By : evkwan
* Date: 20/9/2015
/*****************/

import java.util.Scanner;
import java.lang.StringBuilder;

public class triangles 
{
	public static void main(String[] args){
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Starting triangles program...");
		System.out.print("Enter a number for triangle floors: ");
		String floorStr = inputScanner.nextLine();
		int floor = Integer.parseInt(floorStr);
		System.out.println("Here is your triangle with " + floorStr + " floors: \n");
		
		for (int i=1; i <= floor; i++)
		{
			buildTriangleFloor(i, floor);
		}
		System.out.println("\nExiting program now.");
	}
	
	public static void buildTriangleFloor(int currentFloorLength, int maxFloorLength)
	{
		StringBuilder triFloor = new StringBuilder("");
		
		// First, we calculate the padding required on each side.
		// Compare the number of current floor stars needed to the
		// last floor(bottom) with max floor stars will tell us what is
		// the required padding for each side of the triangle w.r.t
		// the center of the triangle to get an isosceles
		
		int maxStars = (maxFloorLength * 2) - 1;
		int currentStars = (currentFloorLength * 2) - 1;
		int padding = (maxStars - currentStars) / 2;
		
		// Fill in the line now:
		// it should be (padding)(stars)(padding)

		//First padding:
		for(int i=0; i < padding; i++)
		{
			triFloor.append(" ");
		}
		
		//Stars
		for(int i=0; i < currentStars; i++)
		{
			triFloor.append("*");
		}
		
		//Second padding:
		for(int i=0; i < padding; i++)
		{
			triFloor.append(" ");
		}
		
		System.out.println(triFloor);
	}

}