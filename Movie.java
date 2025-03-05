package cmsc203lab1;

/**
 * Movie class, represents a Movie object
 */
public class Movie {

    private String title;
    private String rating;
    private int soldTickets;

    /**
     * Default no-argument Constructor
     */
    public Movie() {
        title = "";
        rating = "";
        soldTickets = 0;
    }

    /**
     * Copy Constructor - creates a deep copy of another Movie object
     * @param m A Movie Object to copy
     */
    public Movie(Movie m) {
        this.title = m.title;
        this.rating = m.rating;
        this.soldTickets = m.soldTickets;
    }

    /**
     * Parameterized Constructor
     * @param title The title of the movie
     * @param rating The rating of the movie
     * @param soldTickets The number of tickets sold
     */
    public Movie(String title, String rating, int soldTickets) {
        this.title = title;
        this.rating = rating;
        this.soldTickets = soldTickets;
    }

    /**
     * Gets the movie title
     * @return The title of the movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the movie title
     * @param title The title of the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the movie rating
     * @return The rating of the movie
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the movie rating
     * @param rating The rating of the movie
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Gets the number of tickets sold
     * @return The number of tickets sold
     */
    public int getSoldTickets() {
        return soldTickets;
    }

    /**
     * Sets the number of tickets sold
     * @param soldTickets The number of tickets sold
     */
    public void setSoldTickets(int soldTickets) {
        this.soldTickets = soldTickets;
    }

    /**
     * Returns a string representation of the movie object
     * @return A formatted string with movie details
     */
    @Override
    public String toString() {
        return title + " (" + rating + "): Tickets Sold: " + soldTickets;
    }
}
