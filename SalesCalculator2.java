import java.util.Scanner;

public class SalesCalculator2{
	
	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	System.out.println("Enter the number of total items sold");

	double numberOfItems = userInput.nextDouble();

        for(double count = 0; count < numberOfItems; count++){

	System.out.println("Enter the value of the total items " + (count + 1) );

	}

	double itemsValue = userInput.nextDouble();

        double commission = 0.09*itemsValue;

	double earning = 200 + commission;

	System.out.println("Total Sales is" + itemsValue);

	System.out.println("Total commission is " + commission);

	System.out.println("Earnings is " + earning);
 
     }



}
	
	