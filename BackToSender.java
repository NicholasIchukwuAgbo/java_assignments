import java.util.Scanner;
import java.util.InputMismatchException;

public class BackToSender{

public static int backToSender(int riderSuccessfulDelivery){

int basePay = 5000;

int wages = 0; 

if (riderSuccessfulDelivery < 50){

wages = riderSuccessfulDelivery * 160 + basePay;

}else if (riderSuccessfulDelivery <= 59){

wages = riderSuccessfulDelivery * 200 + basePay;

}else if (riderSuccessfulDelivery <= 69){

wages = riderSuccessfulDelivery * 250 + basePay;

}else if (riderSuccessfulDelivery >= 70){
wages = riderSuccessfulDelivery * 500 + basePay;

}

return wages;

  }

public static void main(String[] args){

Scanner userInput = new Scanner(System.in);
int totalDelivery;

while(true){
    try{
	System.out.print("Enter number of successful delivery: ");
	totalDelivery = userInput.nextInt();
	break;
	}catch(InputMismatchException e){
	System.out.print("invalid, try again");
	userInput.next();
    }
   }

while(totalDelivery < 0){
System.out.print("Invalid, try again: ");
totalDelivery = userInput.nextInt();
 }


System.out.print(backToSender(totalDelivery));

  
  }
}