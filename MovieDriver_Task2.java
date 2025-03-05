package cmsc203lab1;
/**
 * CMSC203 Lab 1 - Movie Driver
 * Author: [Kasish Pradhan]
 * Date: [02/24/2025]
 * Description: This class allows the user to enter multiple movies using a loop.
 */


import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            // Create a Movie object
            Movie movie = new Movie();

            // Read title
            System.out.print("Enter the movie title: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            // Read rating
            System.out.print("Enter the movie rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            // Read tickets sold
            System.out.print("Enter number of tickets sold: ");
            int soldTickets = scanner.nextInt();
            movie.setSoldTickets(soldTickets);

            // Display movie details
            System.out.println(movie.toString());

            // Ask if the user wants to enter another movie
            System.out.print("Do you want to enter another movie? (yes/no): ");
            scanner.nextLine(); // Consume newline
            continueInput = scanner.nextLine();

        } while (continueInput.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
