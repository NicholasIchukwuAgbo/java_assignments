import java.util.Scanner;

public class SalesCalculator{
	
	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	System.out.println("Enter the number of total items sold");

	double numberOfItems = userInput.nextDouble();
	
	double totalSales = 0;

	for(double count = 0; count < 1; count++){

	System.out.println("Enter the value of the total items ");
	}

	double itemsValue = userInput.nextDouble();

	double totalAmountSales = itemsValue;

	double commission = 0.09 * totalAmountSales;

	double earning = 200 + commission;

	System.out.println("Total Sales is " + totalAmountSales);

	System.out.println("Total commission is " + commission);

	System.out.println("Earnings is " + earning);
 
     }



}
	
	