import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		int myAge;
		boolean isValid = false;

		
		while (!isValid) {
			Scanner input = new Scanner(System.in); // create input scanner
			try {
				
				System.out.println("Please enter your age: ");
				myAge = input.nextInt();
				
				System.out.println("\nYou entered: " + myAge);
				isValid = true;
				
			} catch (Exception exception) {
				System.out.println("Please enter a positive number");
			}
		}
		
		
		
		
		
	}

}
