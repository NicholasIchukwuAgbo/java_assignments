import java.util.Scanner;
import java.util.InputMismatchException;

public class PizzaWahala{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

int numberOfGuests;
int pizzaType = 0;

  while (true){
	try{
	System.out.print("Enter number of guests: ");
	numberOfGuests = userInput.nextInt();
	break;
	}catch(InputMismatchException e){
	System.out.print("invalid Input, try again: ");
	userInput.next();
	}
	}
	
	while(numberOfGuests < 1 || numberOfGuests > 100){
	System.out.print("Invalid, try again (min 1, max 100): ");
	numberOfGuests = userInput.nextInt();
	}

	System.out.println(""" 
	
	Below is our price list Sir/Ma'am.

	Pizza Type | Number of Slices | Price Per Box
	----------------------------------------------
	1: Sapa size     ->    4     ->         2,500
		       		  
	2: Small money   ->    6     ->         2,900
 		       		                         
	3: Big boys      ->    8     ->         4,000
                                         
	4: Odogwu       ->    12     ->         5,200
					     
	""");

while (true){
	try{
	System.out.print("Enter pizza type from the list above: ");
	pizzaType = userInput.nextInt();
	break;
	}catch (InputMismatchException e){
	System.out.print("invalid, try again: ");
	userInput.next();
	}
	}

	while(pizzaType < 1 || pizzaType > 4){
	System.out.print("Invalid, choose(1-4): ");
	pizzaType = userInput.nextInt();
	}

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
	 	System.out.println("Invalid choice, pls try again");
			break;
	}
	
	int boxes =  (int) Math.ceil((double) numberOfGuests / slicePerBox);

	int leftoverSlice = boxes * slicePerBox - numberOfGuests;

	int totalCost = boxes * pricePerBox;


	System.out.println("Number of Boxes: " + boxes + " Boxes");

	System.out.println("Leftover Slice: " + leftoverSlice + " Slices" );
	
	System.out.println("Total Cost: " + totalCost + " Naira Only");

    }

 }

	