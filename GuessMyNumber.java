import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber{

	
public static void main(String[] args){

Scanner input = new Scanner(System.in);

Random number = new Random();

int guessing = number.nextInt(1, 100);

String chances = {"life", "life", "life", "life", "life"};
String win = "Congratulation";
String lose = "you lose";

System.out.println("Welcome To My Game Hall");

while(true){

System.out.println("Guess a number between 1 - 100");
int user_input = input.nextInt();

if(user_input > guessing){

chances = remove(chances, "life");
chances = add(chances, "otilo");
System.out.print("You guess too high");

}





  }

  }

}