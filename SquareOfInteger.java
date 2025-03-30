import java.util.Scanner;

public class SquareOfInteger{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	int num = 0;

	int square = 0;

	System.out.println("Enter A Number");

	num = userInput.nextInt();

	square = square + num * 2;
		System.out.println("The Square is: " + square);
	 }
}

