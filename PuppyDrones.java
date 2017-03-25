//Chad Wishner 6631-5393 Section: 149A
//Import Java utility to read user inputs
import java.util.Scanner;
public class PuppyDrones {
	public static void main(String [] args) {
//Create a new scanner to read the user's inputs for various coordinates		
		Scanner coordinate = new Scanner(System.in);
//Ask user for inputs and save them as separate variables		
		System.out.println("Please enter the x coordinate of Drone 1");
		double X1 = coordinate.nextDouble();
		System.out.println("Please enter the y coordinate of Drone 1");
		double Y1 = coordinate.nextDouble();
		System.out.println("Please enter the altitude of Drone 1");
		double ALT1 = coordinate.nextDouble();
		System.out.println("Please enter the x coordinate of Drone 2");
		double X2 = coordinate.nextDouble();
		System.out.println("Please enter the y coordinate of Drone 2");
		double Y2 = coordinate.nextDouble();
		System.out.println("Please enter the altitude of Drone 2");
		double ALT2 = coordinate.nextDouble();
//Calculate the distance between the 2 drones on a 2d surface and decide if the drones are <1, >500, or between 1 and 500 feet apart, depending on their distance, print out the correct statement. 
		if (Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2)) < 1){
			System.out.println("The two drones are " + Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2)) + " feet apart in (x,y) coordinates. They need to move farther apart in (x,y).");
		}
		if (Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2)) > 500){
			System.out.println("The two drones are " + Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2)) + " feet apart in (x,y) coordinates. They need to move closer together in (x,y).");
		}
		if (1 <= Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2)) && Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2)) <= 500){
			System.out.println("The two drones are " + Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2)) + " feet apart in (x,y) coordinates. They do not need to move farther apart or closer in (x,y).");
		}
//Calculate the distance between the 2 drones in 3 dimensions and decide if the drones are <1, >500, or between 1 and 500 feet apart, depending on their distance, print out the correct statement. 
		if (Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2) + Math.pow((ALT2-ALT1), 2)) < 1){
			System.out.println("The two drones are " + Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2) + Math.pow((ALT2-ALT1), 2)) + " feet apart in 3D space. They need to move farther apart.");
		}
		if (Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2) + Math.pow((ALT2-ALT1), 2)) > 500){
			System.out.println("The two drones are " + Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2) + Math.pow((ALT2-ALT1), 2)) + " feet apart in 3D space. They need to move closer together.");
		}
		if (1 <= Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2) + Math.pow((ALT2-ALT1), 2)) && Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2) + Math.pow((ALT2-ALT1), 2)) <= 500){
			System.out.println("The two drones are " + Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2) + Math.pow((ALT2-ALT1), 2)) + " feet apart in 3D space. They do not need to move farther apart or closer.");
		}
	}
}