/* In this exercise we are simply converting imperial mass into kilograms utilising the scanner tool*/
import java.util.Scanner; 

public class Ex2 {
	public static void main(String[] args) {

	Scanner input = new Scanner (System.in);

	float ton;	/* I learned about float from the website listed further in the 			program for part A*/ 
	float hundredweight;
	float quarter;
	float stone;
	float ounce;
	float drachm;
	float grain;
	float pound;

	double answ;
	double stones = 11; //For part B of the exercise
	double pounds = 6;

	System.out.print("Enter amount in tons to convert into kg: "); // Part A
	ton = input.nextFloat();

	System.out.print("Enter amount in hundredweights to convert into kg: ");
	hundredweight = input.nextFloat();

	System.out.print("Enter amount in quarters to convert into kg: ");
	quarter = input.nextFloat();

	System.out.print("Enter amount in stones to convert into kg: ");
	stone = input.nextFloat();

	System.out.print("Enter amount in ounces to convert into kg: ");
	ounce = input.nextFloat();

	System.out.print("Enter amount in drachms to convert into kg: ");
	drachm = input.nextFloat();

	System.out.print("Enter amount in grains to convert into kg: ");
	grain = input.nextFloat();

	System.out.print("Enter amount in pounds to convert into kg: ");
	pound = input.nextFloat();

	answ = ton * 2240 * 0.45359237;
	System.out.printf("Tons in KG is %.2f%n", answ); //The following website helped me understand going out to 2 decimal places and how to use the printf function in addition to chapter 2 of our course text 						http://www.progressivejava.net/2012/08/java-math-addition-subtraction.html

    	answ = hundredweight * 112 * 0.45359237;
	System.out.printf("Hundredweights in KG is %.2f%n", answ);

	answ = quarter * 28 * 0.45359237;
	System.out.printf("Quarters in KG is %.2f%n", answ);

	answ = stone * 14 * 0.45359237;
	System.out.printf("Stones in KG is %.2f%n", answ);

	answ = ounce * 0.0625 * 0.45359237;
	System.out.printf("Ounces in KG is %f%n", answ);

	answ = drachm * 0.00390625 * 0.45359237;
	System.out.printf("Drachms in KG is %f%n", answ);

	answ = grain * 0.000142857 * 0.45359237;
	System.out.printf("Grains in KG is %f%n", answ);

	answ = pound * 0.45359237;
	System.out.printf("Pound in KG is %f%n", answ);

	System.out.println("Sum in KG of " + stones + " stones and " + pounds + " pounds is " + ((stones*14*0.45359237)+(pounds*0.45359237)) + " kg."); // Part B
	}
}
