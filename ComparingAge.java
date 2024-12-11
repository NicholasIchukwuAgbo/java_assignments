//NO: 4.15) (a)...
import java.util.Scanner;

public class ComparingAge{

	public static void main(String[] args){
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter Your Age");

	int age = userInput.nextInt();

	if(age >= 65){

	System.out.println("Age is greater than or equal to 65 " + age);
       	
	} else System.out.println("Age is lesser than 65 " + age);



	}



   }