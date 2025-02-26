import java.util.Scanner;

public class CompoundInterestCalculator{

	public static double compoundInterestRate(double principal, double 

annualInterestRate, int year, int compoundFrequency){

	double rate = annualInterestRate / 100 / compoundFrequency;

	double time = year * compoundFrequency;

	return principal * Math.pow((1 + rate), time) - principal;

    }
    
public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter principal amount  :$");
	double principal = userInput.nextDouble();

	System.out.print("Enter annual interest rate (%): ");
	double annualInterestRate = userInput.nextDouble();

	System.out.print("Enter numbers of years: ");
	int year = userInput.nextInt();;

	System.out.print("Enter compound frequency: ");
	int compoundFrequency = userInput.nextInt();

double compoundInterest = compoundInterestRate(principal, annualInterestRate, year, 

compoundFrequency);

System.out.println("Compound interest rate is: " + compoundInterest);

	}

  }