//Getting a user input
package Practice;
import java.util.Scanner;

public class Banking{
	public static void main(String[] args) {
//BLUEPRINT:
//Bank has Customer's name, pin, A/c number etc.
//Bank does withdraw, deposit, transfer, etc.
//Logic : If deposit, withdraw,etc: affects what bank has..
		
		int balance = 100;
	    String customername ="John";
		int pin = 1234;
		
		Scanner sc =  new Scanner(System.in);
	
		System.out.println("Enter an Amount");
		int amount = sc.nextInt();//To get a user input

	if(amount > balance)
				System.out.println("Insufficient fund");
			else
				System.out.println("Balance Available is");
				System.out.println(balance = balance - amount);
				
				
}


 
		 
	 }

				

	


	
//Learn to call the Withdraw method..
//HOw to get input from the user.