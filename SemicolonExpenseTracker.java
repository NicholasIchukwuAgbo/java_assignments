import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SemicolonExpenseTracker{

    public static boolean getDate(String date){

        try {

            java.time.LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd"));

            return true;

        } catch (java.time.format.DateTimeParseException e){

            return false;
        }
    }

    public static boolean getDescription(String description){

        return !description.trim().isEmpty();
    }

    public static boolean getAmount(double amount){

        return amount >= 1;
    }

    public static double calculateTotalExpenses(ArrayList<Double> amountHolder){

        double total = 0;

        for (Double amount : amountHolder){

            total += amount;

        }

        return total;
    }

    public static void main(String[] args){

        ArrayList<String> dateHolder = new ArrayList<>();

        ArrayList<String> descriptionHolder = new ArrayList<>();

        ArrayList<Double> amountHolder = new ArrayList<>();
	
	String date;
	
	String description;

	double amount;

        Scanner userInputCollection = new Scanner(System.in);

        while (true){

            System.out.println("\n1. Add an expense.");

            System.out.println("2. View all expenses.");

            System.out.println("3. Calculate total expenses.");

            System.out.println("4. Exit.");

            try {

                System.out.print("\nEnter your choice (1-4): ");

                int choice = userInputCollection.nextInt();

                userInputCollection.nextLine(); 

                if (choice < 1 || choice > 4){

                    System.out.println("Invalid choice. Please choose a valid option.");

                    continue;
                }


                switch (choice){
                    case 1:

                        while (true){

                            System.out.print("\nEnter the date (yyyy/MM/dd): ");

                            date = userInputCollection.nextLine();

                            if (getDate(date)){

                                dateHolder.add(date);

                                break;

                            } else {

                                System.out.println("Invalid date format. Please use yyyy/MM/dd.");

                            }
                        }


                        while (true){

                            System.out.print("Enter the description: ");

                            description = userInputCollection.nextLine();

                            if (getDescription(description)){

                                descriptionHolder.add(description);

                                break;

                            } else {

                                System.out.println("Description cannot be empty.");
                            }
                        }


                        while (true){

                            try {

                                System.out.print("Enter the amount: ");

                                amount = userInputCollection.nextDouble();

                                userInputCollection.nextLine();

                                if (getAmount(amount)){

                                    amountHolder.add(amount);

                                    break;

                                } else{

                                    System.out.println("Amount must be greater than or equal to 1.");

                                }


                            } catch (InputMismatchException e){

                                System.out.println("Invalid input. Please enter a valid number.");

                                userInputCollection.nextLine(); 
                            }
                        }

                        System.out.println("Expense added!");

                        break;

                    case 2:

                        System.out.println("\n::::Expenses::::\n");

                        if (dateHolder.isEmpty()){

                            System.out.println("No expense records yet..");

                        } else {

                            for (int i = 0; i < dateHolder.size(); i++){

                                System.out.println((i + 1) + ". Date: " + dateHolder.get(i) + ", Description: " + descriptionHolder.get(i) + ", Amount: " + amountHolder.get(i));
                            }
                        }

                        break;

                    case 3:

                        double total = calculateTotalExpenses(amountHolder);

                        if (amountHolder.isEmpty()){

                            System.out.println("No expenses to calculate.");

                        } else{

                            System.out.println("\nTotal Expenses: " + total);

                        }
                        break;

                    case 4:

                        System.out.println("\nExiting the app. Goodbye!");

                        return;
                }
            } catch (InputMismatchException e){

                System.out.println("Invalid input. Please enter a valid number.");

                userInputCollection.nextLine();
            
		
		}

        }
    }
}
