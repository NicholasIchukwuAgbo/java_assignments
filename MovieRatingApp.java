import java.util.*;

public class MovieRatingApp {

public static boolean getMovie(String movie) {
 return !movie.trim().isEmpty();
}

public static boolean getMovieTitle(String title) {
 return !title.trim().isEmpty();
}

public static void main(String[] args) {

Scanner userInputCollection = new Scanner(System.in);
Map<String, List<Double>> movies = new HashMap<>();
int choice = 0;

        
while (true) {
System.out.println("\n1. Add a Movie");
System.out.println("2. Rate a Movie");
System.out.println("3. View Average Rating");
System.out.println("4. Exit");


try {
    System.out.print("\nEnter your choice: ");
    choice = Integer.parseInt(userInputCollection.nextLine());

    if (choice < 1 || choice > 4) {
    System.out.println("Invalid choice. Please try again.");
    continue;
   }
          
} catch (NumberFormatException e) {
  System.out.println("Invalid input, try again");
   continue;
 }

            

if (choice == 1) {
   while (true) {
   System.out.print("\nEnter the movie name: ");
   String movieBox = userInputCollection.nextLine();

   if (getMovie(movieBox)) {
      System.out.println("\nMovie '" + movieBox + "' added!");
      break;
      } else {
      System.out.println("\nInvalid, movie name can't be empty");
        }
      }

 } else if (choice == 2) {
     while (true) {
     System.out.print("Enter the movie name: ");
     String title = userInputCollection.nextLine();

     if (getMovieTitle(title)) {
     try {
          System.out.print("Enter your rating (1-5): ");
          double rating = Double.parseDouble(userInputCollection.nextLine());

          if (rating >= 1 && rating <= 5) {
           if (movies.containsKey(title)) {
            movies.get(title).add(rating);
           } else {

          List<Double> ratings = new ArrayList<>();
          ratings.add(rating);
          movies.put(title, ratings);
          }
          System.out.println("\nRating added for '" + title + "' " + rating);
          break;
         } else {
         System.out.println("Rating must be between 1 and 5.");
         }

      } catch (NumberFormatException e) {
       System.out.println("Invalid rating. Please enter a number.");
      }
     } else {
     System.out.println("\nInvalid, movie name can't be empty");
     }
   }

   } else if (choice == 3) {
    for (Map.Entry<String, List<Double>> entry : movies.entrySet()) {
    String movieTitle = entry.getKey();
    List<Double> ratings = entry.getValue();

   if (ratings != null && !ratings.isEmpty()) {
   double averageRating = ratings.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    System.out.printf("%s: %.2f%n", movieTitle, averageRating);
   } else {
    System.out.println(movieTitle + ": No rating yet");
    }
   }

  } else if (choice == 4) {
   System.out.println("Exiting the application. Goodbye!");
  break;
   }
  }
 }
}
