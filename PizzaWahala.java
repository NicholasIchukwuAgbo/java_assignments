import java.util.Scanner;

public class PizzaWahala{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	System.out.println(""" 
	
	Below is our price list Sir/Madam...

	Pizza Type | Number of Slices | Price Per Box
	----------------------------------------------
	1: Sapa size     ->    4     ->         2,500
		       		  
	2: Small money   ->    6     ->         2,900
 		       		                         
	3: Big boys      ->    8     ->         4,000
                                         
	4: Odogwu       ->    12     ->         5,200
					     
	""");

	System.out.print("Enter pizza type from the list above: ");

	int pizzaType = userInput.nextInt();

	System.out.print("Enter number of guests: ");

	int numberOfGuests = userInput.nextInt();

	int pricePerBox = 0;

	int slicePerBox = 0;

	switch (pizzaType) {

	case 1:
		pricePerBox = 2500;
		slicePerBox = 4;
		break;

	case 2:
		pricePerBox = 2900;
		slicePerBox = 6;
		break;

	case 3:
		pricePerBox = 4000;
		slicePerBox = 8;
		break;

	case 4:
		pricePerBox = 5200;
		slicePerBox = 12;
		break;

	default:
	 	System.out.print("Invalid choice, pls try again");

	}
	
	int boxes =  (int) Math.ceil((double) numberOfGuests / slicePerBox);

	System.out.println("Number of Boxes: " + boxes + " Boxes");

	int leftoverSlice = boxes * slicePerBox - numberOfGuests;

	System.out.println("Leftover Slice: " + leftoverSlice + " Slices" );

	int totalCost = boxes * pricePerBox;
	
	System.out.println("Total Cost: " + totalCost + " Naira Only");

    }

 }

	