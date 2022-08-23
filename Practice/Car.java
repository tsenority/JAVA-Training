package Practice;
import java.util.Scanner;

public class Car {
	public static void main(String[] args) {
		String carname = "Honda";
		int year = 2022;
		int mileage = 5000; 
		int speedlimit = 90;
		
		Scanner sc =  new Scanner(System.in);//creates a sc object.
		System.out.println("Enter your speed");
		int speed = sc.nextInt();//To get a user input
		
		if(speed > speedlimit)
			System.out.println("stop!"+ " "  +"over 90mph");
		// concatenate
		//to leave space, enter +""
		else
			System.out.println("Proceed");
			
	
	
	}
	
}