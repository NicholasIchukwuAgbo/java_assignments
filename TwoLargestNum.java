//N0: 4.23)
import java.util.Scanner;

public class TwoLargestNum{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;

	int secondLargest = Integer.MIN_VALUE;

	int counter = 0;
 
        while (counter < 10) {

        System.out.print("Enter a number:  ");

        int num = scanner.nextInt();

        if (num > largest) {

        largest = num;

        } 

        if (num > secondLargest && num != largest) {
	secondLargest = num;
            }
 	 counter++;
      
      
        }

        System.out.println("Largest Number is: " + largest);
  	System.out.println("Second Largest Number is: " + secondLargest);

   }


}