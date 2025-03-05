package cmsc203lab1;

import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a Movie object
        Movie movie = new Movie();
        
        // Read title from user
        System.out.print("Enter the movie title: ");
        String title = scanner.nextLine();
        movie.setTitle(title);
        
        // Read rating from user
        System.out.print("Enter the movie rating: ");
        String rating = scanner.nextLine();
        movie.setRating(rating);
        
        // Read number of tickets sold
        System.out.print("Enter number of tickets sold: ");
        int soldTickets = scanner.nextInt();
        movie.setSoldTickets(soldTickets);
        
        // Display movie details
        System.out.println(movie.toString());

        scanner.close();
    }
}
           