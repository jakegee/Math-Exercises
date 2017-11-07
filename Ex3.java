import java.util.Scanner;

/**
* @author Jacob Smith
* In this exercise we're finding out the total gain after capital is
* multiplied by the fixed interest rate over the first 5 years and then
* after 500 years
*/

public class Ex3
	{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	double total;
	double capital = 100.00;
	double irate = 1.023;	/*I added 1 + 0.023 myself because I found it easier than drawing out the calculation in the later code*/

		total = capital * (Math.pow(irate,1.00)); /*I learned the Math.pow method from chapter 5 in our textbook by scanning ahead to learn of a way to calculate exponents*/
			System.out.println(total);
		total = capital * (Math.pow(irate,2.00));
			System.out.println(total);
		total = capital * (Math.pow(irate,3.00));
			System.out.println(total);
		total = capital * (Math.pow(irate,4.00));
			System.out.println(total);
		total = capital * (Math.pow(irate,5.00));
			System.out.println(total);
		total = capital * (Math.pow(irate,500.00));
			System.out.println(total);
	}
}
