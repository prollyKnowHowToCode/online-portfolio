import java.util.Scanner;

public class Module1CaseStudy2BSIT27ASUS{
public static void main(String [] args){
//psvm

//scanner
Scanner userInput = new Scanner(System.in);

//input of first and second number
System.out.print("Input first number: ");
int firstNum = userInput.nextInt();
System.out.print("Input second number: ");
int secondNum = userInput.nextInt();

System.out.println("--------------------");
System.out.println("");


System.out.println("[1] Multiplication \n[2] Division \n[3] Modulo");
System.out.print("Select an action:");

//user selection
int userSelect = userInput.nextInt();

//Multiplication
if (userSelect == 1){	
int mul = 0;
for (int counter = 0; counter < secondNum; counter++){
	mul +=firstNum;	
}

System.out.println("Product: " + mul);
//end of Multiplication

//Division
} if (userSelect == 2){
	int quo = 0;
	int temp = firstNum;
	for (; temp >= secondNum; quo++){
		temp -= secondNum;
}
System.out.println("Quotient: " + quo);
//end of Division	

//Modulo
} if (userSelect == 3) {
	int quo = 0;
	int temp = firstNum;
	for (; temp >= secondNum; quo++){
		temp -= secondNum;
		
}
	int remainder = temp;
		System.out.println("Remainder: " + remainder);
}//end of Modulo

}//end of main method

	}//end of class	



