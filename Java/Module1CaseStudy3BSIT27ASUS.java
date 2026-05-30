import java.util.Random;
import java.util.Scanner;

public class Module1CaseStudy3BSIT27ASUS{
public static void main(String [] args){
//psvm

Random userRandomNum = new Random();
Scanner userInput = new Scanner(System.in);
//Random number generator and Scanner 

//Creation of random number
int randomNumGen = userRandomNum.nextInt(50)+1;

System.out.println("\t----- GUESSING GAME -----");

int attempts = 1;

while (true){
	//System.out.println("Random number generated: " + randomNumGen);
	System.out.print("Enter a number (Attempt #" + attempts + ") : ");
	attempts++;
	int randomNumGuess = userInput.nextInt();
	if (randomNumGuess > randomNumGen){
		System.out.println("The guess number is lower than " + randomNumGuess);
		
	}else if (randomNumGuess < randomNumGen){
		System.out.println("The guess number is higher than " + randomNumGuess);
		
	}else{
		System.out.println("Congratulations, you got it right after " + (attempts - 1) + " attempts");
		break;
	}	
	
	
	
} 




}
//end of main method
}
//end of class