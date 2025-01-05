import java.util.Scanner;

public class SemicolonStore{

	public static void main(String[] args){

	Scanner userInputCollection = new Scanner(System.in);

	String optional = " ";
	String goodsPurchase2 = " ";
	int numberOfGoodsPurchase2 = 0;
	double pricePerOne2 = 0;
	double total = 0;
	double discount = 0;
	double vat = 0;
	double totalBill = 0;
	double balance = 0;

	System.out.print("Customer's Name?: ");
	String customerName = userInputCollection.next();

	System.out.print("What did the customer buy?3: ");
	String goodsPurchase = userInputCollection.next();

	System.out.print("How many pieces?: ");
	int numberOfGoodsPurchase = userInputCollection.nextInt();

	System.out.print("How much per unit?: ");
	double pricePerOne = userInputCollection.nextDouble();

	System.out.print("Add more items? (Yes/No): ");
	optional = userInputCollection.next();

	if(optional.equalsIgnoreCase("Yes")){

	System.out.print("What did the customer buy: ");
	goodsPurchase2 = userInputCollection.next();

	System.out.print("How many pieces?: ");
	numberOfGoodsPurchase2 = userInputCollection.nextInt();

	System.out.print("How much per unit?: ");
	pricePerOne2 = userInputCollection.nextInt();

	System.out.print("Add more items? (Yes/No): ");
	optional = userInputCollection.next();

	}

	if(optional.equalsIgnoreCase("No")){
	
	System.out.print("Cashier name?: ");
	String cashierName = userInputCollection.next();

	System.out.print("How mush discount will He get?: ");
	double discountAmount = userInputCollection.nextDouble();

	System.out.println("""

	SEMICOLON STORES

	MAIN BRANCH

	TEL: 0468348456

	Date: 28-Dec-22 8:48:11pm

	""");

	System.out.println("Cashier: " + cashierName);

	System.out.println("Customer's Name: " + customerName);
	
	System.out.println("""
	========================================================
	   	ITEMS       QTY     PRICE      TOTAL(NGN)
	--------------------------------------------------------
	""");

	total = (pricePerOne * 	numberOfGoodsPurchase) + (pricePerOne2 * numberOfGoodsPurchase2);
	discount = total * 0.075;
	vat = total * 0.175;
	totalBill = (total + vat) - discount;
	
	System.out.println("        " + goodsPurchase + "         " + numberOfGoodsPurchase + "         " + pricePerOne + "       " +  pricePerOne * 	numberOfGoodsPurchase);

	System.out.println("        " + goodsPurchase2 + "         " + numberOfGoodsPurchase2 + "         " + pricePerOne2 + "       " +  pricePerOne2 * 	numberOfGoodsPurchase2);

	System.out.println("Sub Total: " + total );

	System.out.println("Discount: " + discount );

	System.out.println("VAT: " + vat );

	System.out.println("Bill Total: " + totalBill );

	System.out.println("THIS IS NOT AN RECIEPT KINDLY PAY: " + totalBill);


	System.out.print("How much did the customer give you?: ");
	double amountPaid = userInputCollection.nextDouble();

	System.out.println("""

	SEMICOLON STORES

	MAIN BRANCH

	TEL: 0468348456

	Date: 28-Dec-22 8:48:11pm

	""");

	System.out.println("Cashier: " + cashierName);

	System.out.println("Customer's Name: " + customerName);
	
	System.out.println("""
	========================================================
	   	ITEMS       QTY     PRICE      TOTAL(NGN)
	--------------------------------------------------------
	""");

	total = (pricePerOne * 	numberOfGoodsPurchase) + (pricePerOne2 * numberOfGoodsPurchase2);
	discount = total * 0.075;
	vat = total * 0.175;
	totalBill = (total + vat) - discount;
	balance = amountPaid - totalBill;
	
	System.out.println("        " + goodsPurchase + "         " + numberOfGoodsPurchase + "         " + pricePerOne + "       " +  pricePerOne * 	numberOfGoodsPurchase);

	System.out.println("        " + goodsPurchase2 + "         " + numberOfGoodsPurchase2 + "         " + pricePerOne2 + "       " +  pricePerOne2 * 	numberOfGoodsPurchase2);

	System.out.println("Sub Total: " + total );

	System.out.println("Discount: " + discount );
 
	System.out.println("VAT: " + vat );

	System.out.println("Bill Total: " + totalBill );

	System.out.println("Amount Paid: " + amountPaid );

	System.out.println("Balance: " + balance );

	System.out.println("THANK YOU FOR PATRONAGE");

	//System.out.printf("%d%n%f%n%f%n%f%n%f%n%f%n", "total", "discount", "vat", "totalBill", "amountPaid", "balance");

	}


   }

}