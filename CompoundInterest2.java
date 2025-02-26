import java.util.Scanner;

public class CompoundInterest2{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter principal amount  :$");
	double principal = userInput.nextDouble();

	while(principal < 1){
	System.out.print("Invalid, try again: ");
	principal = userInput.nextDouble();
	}

	System.out.print("Enter interest rate (%): ");
	double rate = userInput.nextDouble();

	while(rate < 1){
	System.out.print("Invalid, try again: ");
	rate = userInput.nextDouble();
	}

	System.out.print("Enter numbers of years: ");
	int years = userInput.nextInt();

	while(years < 1){
	System.out.print("Invalid, try again: ");
	years = userInput.nextInt();
	}

	System.out.print("Enter monthly comtribution: ");
	double contribution = userInput.nextDouble();

	System.out.print("Enter compound frequency (1.Yearly, 2.Monthly): ");
	int frequency = userInput.nextInt();
	
	while(frequency > 2) {
        System.out.print("invalid, Try again: " );
        frequency = userInput.nextInt();
	}

	double amount = principal;

	switch(frequency){

     case 1:

	for(int i = 0; i < years; i++){
	double interest = amount * (rate / 100) + contribution;
	amount += interest;
	}
	System.out.printf("%s%.2f%n", "Compound Interest: ", amount);
	break;

     case 2:

	for(int i = 0; i < years * 12; i++){
	double interest = amount * (rate / 100 / 12) + contribution;
	amount += interest;
	}
	System.out.printf("%s%.2f%n", "Compound Interest: ", amount);
	break;
	}
      }

  }