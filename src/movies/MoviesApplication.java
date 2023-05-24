package movies;

import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static Movie[] movieList = findAll();

    public static void main(String[] args) {

        Input in = new Input();

        int choice = -1;

        System.out.println("Hello, welcome to my movie application!!");

        while(choice !=0) {
            System.out.println("What would you like to do?");
//            System.out.println();
//            System.out.println("0 - exit");
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view movies in the animated category");
//            System.out.println("3 - view movies in the drama category");
//            System.out.println("4 - view movies in the horror category");
//            System.out.println("5 - view movies in the scifi category");
//            System.out.println("6 - add new movie\n");
            System.out.println("""
                    
                    0 - exit
                    1 - view all movies
                    2 - view movies in the animated category
                    3 - view movies in the drama category
                    4 - view movies in the horror category
                    5 - view movies in the scifi category
                    6 - add new movie
                    """);
            System.out.print("Enter your choice: ");
            choice = in.getInt(0, 5);
            System.out.println();
            doChoice(choice);
            System.out.println();
        }


    }

    private static void doChoice(int choice){
        switch (choice) {
            case 1 -> printMovies("all");
            case 2 -> printMovies("animated");
            case 3 -> printMovies("drama");
            case 4 -> printMovies("horror");
            case 5 -> printMovies("scifi");
            case 6 -> {
                Movie movie = getNewMovieFromUser();
                movieList = addMovie(movieList, movie);
                printMovies("all");
            }
        }
    }

    private static void printMovies(String category) {
        for (Movie pMovie : movieList){
            if(pMovie.getCategory().equals(category) || category.equalsIgnoreCase("all")){
                System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
            }
        }
    }

    private static Movie getNewMovieFromUser() {
        Input in = new Input();
        System.out.println("Enter movie name: ");
        String name = in.getString();
        System.out.println("Enter movie category: ");
        String category = in.getString();
        Movie nMovie = new Movie(name, category);
        return nMovie;
    }

    public static  Movie[] addMovie(Movie[] movieArr, Movie movie){
        Movie[] nPeople = Arrays.copyOf(movieArr, movieArr.length+1);
        nPeople[movieArr.length] = movie;
        return  nPeople;
    }

}
