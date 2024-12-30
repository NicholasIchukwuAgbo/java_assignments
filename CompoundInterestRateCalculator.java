import java.util.Scanner;

public class CompoundInterestCalculator{

	public static double compoundInterestRate(double principal, double 

annualInterestRate, int year, int compoundFrequency, double monthlyContribution){

	double rate = annualInterestRate / 100 / compoundFrequency;

	double time = year * compoundFrequency;

	return principal * Math.pow((1 + rate), time) - principal + monthlyContribution * Math.pow((1 + rate), (time) - 1) / (rate);

    }
    
public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter principal amount  :$");
	double principal = userInput.nextDouble();

	System.out.print("Enter annual interest rate (%): ");
	double annualInterestRate = userInput.nextDouble();

	System.out.print("Enter numbers of years: ");
	int year = userInput.nextInt();

	System.out.print("Enter compound frequency: ");
	int compoundFrequency = userInput.nextInt();

	System.out.print("Enter monthly comtribution: ");
	double monthlyContribution = userInput.nextInt();

double compoundInterest = compoundInterestRate(principal, annualInterestRate, year, 

compoundFrequency, monthlyContribution);

System.out.println("Compound interest rate is: " + compoundInterest);

	}

  }