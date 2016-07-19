
import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Grand Circus Room Detail Generator!");
		
		Scanner input = new Scanner(System.in);

		float length, width, area, perimeter;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
		// while (choice=='y'||choice=='Y'){	
			//get input from user
			System.out.println("Enter Length: ");
			length = input.nextFloat();
			
			System.out.println("Enter Width:  ");
			width = input.nextFloat();
			
			area = length * width;
			System.out.println("Area:  " + area);
			
			perimeter = (2 * length) + (2 * width);
			System.out.println("Perimeter:  " + perimeter);
			
			//check if the user wants to continue
			
			System.out.println("Continue? (y/n):");
			choice = input.nextLine();
			choice = input.nextLine();//garbage
		}		
	
	}
		
}
	

