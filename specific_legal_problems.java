package Exercise_1;

import java.util.Scanner;


public class specific_legal_problems {

	public static void main(String[] args) {
	
		System.out.println("Enter Your Current Age, PLEASE!!! :-");
		
		Scanner userInput = new Scanner (System.in);
		float ageInput = userInput.nextFloat();
		userInput.close();
		
		InputYourAge (ageInput);
	}//end main method
	
	static void InputYourAge (float age) {
		
		String statement;
		
		if (age>=0 && age < 16) {
			statement = "*** You Can't Drive ***";
		}
		else if (age>=16 && age < 18) {
			statement = "*** You Can't Vote ***";
		}
		else if (age>=18 && age < 25) {
			statement = "*** You Can't Rent a Car ***";
		}
		else if (age>=25 ) {
			statement = "*** You Can Do Anything That's Legal ***";
		}
		else {
			statement = "WARNING!!! INVALIDE INPUTE  ";
		}
		
		System.out.println(statement);
	}
	
	
	


}
