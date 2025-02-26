import java.util.Arrays;
import java.util.Scanner;

public class StudentGradesApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("How many students do you have?: ");
        int numbersOfStudents = userInput.nextInt();

        System.out.print("How many subjects do they offer?: ");
        int numbersOfSubjects = userInput.nextInt();

	
        int[][] studentScores = new int[numbersOfStudents][numbersOfSubjects];
	int total = 0;
	int[] totalScores = new int[numbersOfStudents];
        double[] averages = new double[numbersOfStudents];

        for (int row = 0; row < studentScores.length; row++) {
            for (int col = 0; col < studentScores[row].length; col++) {
                System.out.println("Entering score for student " + (row + 1) + ": ");
		System.out.println("Enter score for subject " + (col + 1) + ": ");
                studentScores[row][col] = userInput.nextInt();

                System.out.println("""
		Saving >>>>>>>>>>>>>
		Saved Successfully
		""");
            }

	}

        System.out.println("\n================================================================");
        for (int sub = 0; sub < numbersOfSubjects; sub++) {
            System.out.print("\tSUB" + (sub + 1));
	
	}

  	System.out.printf("	TOT	AVE");

        System.out.println("\n================================================================");

        for (int row = 0; row < studentScores.length; row++) {
            System.out.print("Student " + (row + 1) + ": ");
            for (int col = 0; col < studentScores[row].length; col++) {
                System.out.print(studentScores[row][col] + "	");
                total += studentScores[row][col];
            }
            totalScores[row] = total;
            averages[row] = (double) total / numbersOfSubjects;
            System.out.printf("%d \t%.2f\n", totalScores[row], averages[row]);
        }

          
        int[] positions = new int[numbersOfStudents];


       for(int student = 0; student < numbersOfStudents; student++){
           int position = 1;
           for(int checker = 0; checker < numbersOfStudents; checker++){
            if(averages[student]  < averages[checker]){
            position++;

}
positions[student] = position;

}    
 System.out.println(positions[student]);

}


      System.out.println("\nl================================================================");

     }


}
 