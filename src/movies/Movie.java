//package movies;
//
//import java.util.Scanner;
//
//public class MoviesApplication {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What would you like to do?\n");
//        System.out.println("0) exit");
//        System.out.println("1) view all movies");
//        System.out.println("2) view movies in the animated category");
//        System.out.println("3) view movies in the drama category");
//        System.out.println("4) view movies in the horror category");
//        System.out.println("5) view movies in the scifi category\n");
//
//        while (true) {
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            if (choice == 0) {
//                System.out.println("\nGoodbye!");
//                return;
//            } else if (choice == 1) {
//                System.out.println("\nAll movies:\n");
//                printMovies(MoviesArray.findAll());
//            } else if (choice == 2) {
//                System.out.println("\nAnimated movies:\n");
//                printMovies(getMoviesByCategory("animated"));
//            } else if (choice == 3) {
//                System.out.println("\nDrama movies:\n");
//                printMovies(getMoviesByCategory("drama"));
//            } else if (choice == 4) {
//                System.out.println("\nHorror movies:\n");
//                printMovies(getMoviesByCategory("horror"));
//            } else if (choice == 5) {
//                System.out.println("\nSci-fi movies:\n");
//                printMovies(getMoviesByCategory("scifi"));
//            } else {
//                System.out.println("\nInvalid choice. Please try again.\n");
//            }
//        }
//    }
//}
