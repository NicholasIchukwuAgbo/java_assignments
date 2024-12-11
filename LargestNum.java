//N0: 4.21)
import java.util.Scanner;

public class LargestNum{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;

	int counter = 0;
 
        while (counter < 10) {

        System.out.print("Enter a number " + (counter + 1) + ": ");

        int num = scanner.nextInt();

        if (num > largest) {

        largest = num;

        }

        counter++;
        }

        System.out.println("largest number is: " + largest);
   

   }


}

