package movies;
import util.Input;
import java.util.Arrays;

import static movies.MoviesArray.addMovie;

public class MoviesApplication {

    static Input in = new Input();

    static Movie[] movies = MoviesArray.findAll();


    public static void main(String[] args) {

        boolean yesNo = true;

        do {
            String intPrompt = "What would you like to do?\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - view movies in the musical category\n" +
                    "7 - add a new movie\n" +
                    "Enter your choice: ";
            int numIntRangePrompt = in.getInt(0, 7, intPrompt);

            System.out.println("You entered: " + numIntRangePrompt);

            switch (numIntRangePrompt) {
                case 0:
                    System.out.println("Bye!");
                    yesNo = false;
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.printf("%-35s%s%-10s%n", movie.getName(), " -- ", movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("animated")){
                            System.out.printf("%-35s%s%-10s%n", movie.getName(), " -- ", movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("drama")){
                            System.out.printf("%-35s%s%-10s%n", movie.getName(), " -- ", movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("horror")){
                            System.out.printf("%-35s%s%-10s%n", movie.getName(), " -- ", movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("scifi")){
                            System.out.printf("%-35s%s%-10s%n", movie.getName(), " -- ", movie.getCategory());
                        }
                    }
                    break;
                case 6:
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("musical")){
                            System.out.printf("%-35s%s%-10s%n", movie.getName(), " -- ", movie.getCategory());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Okay! Let's add a new movie - you will be prompted to enter the movie name and category.");
                    String newName = in.getString("Enter the movie name: ");
                    String newCategory = in.getString("Enter the movie category (animated, drama, horror, scifi, or musical): ");
                    System.out.println("Adding the new movie... please wait...");
                    Movie[] newMovieArray = addMovie(movies, newName, newCategory);
                    // added to temporary array, display all movies to reflect the one added
                    for (Movie movie :newMovieArray) {
                        System.out.printf("%-35s%s%-10s%n", movie.getName(), " -- ", movie.getCategory());
                    }
                    break;
                default:
                    System.out.println("Please enter one of the options.");
            }
            String boolPrompt = "Do you want to continue? (y/n): ";
            yesNo = in.yesNo(boolPrompt);
        } while (yesNo);
    }
}
