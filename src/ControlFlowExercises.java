import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        int i =5;
//        while(i <= 15){
//            System.out.print(i+ " ");
//            i++;
//        } 1a) While complete
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100); 1B pt1) complete

//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10); 1B pt2) complete

//        int i = 2;
//
//        do {
//            if (i == 2 || i == 4 || i == 16 || i == 256 || i == 65536) {
//                System.out.println(i);
//            }
//            i *= 2;
//        } while (i < 1000000); 1B pt3) complete

        // this loop will go through 100 times and follow the conditionals for fizzbuzz
        //by using the conditionals and modulo is for seeing if numbers are divisible
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i); fizz buzz complete
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        String answer;
//
//        do {
//            System.out.print("Enter an number please: ");
//            int n = scanner.nextInt();
//
//            //the code below is seperated using the t method it's like some dash thing
//            System.out.println("Number\tSquare\tCube");
//            System.out.println("------\t------\t------");
//
//            //a for loop that declares a new integer that is less than or equal to n
//            for (int i = 1; i <= n; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//
//                //docs oracle  java tutorial over formatting numeric print output really helped I recommend it
//                //%d passes an integer as an argument (I think)
//                System.out.printf("%d\t%d\t%d%n", i, square, cube);
//            }
//
//            System.out.print("Do you want to continue? (y/n): ");
//            answer = scanner.next();
//        } while (answer.equalsIgnoreCase("y"));

        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Enter a numerical a grade: ");
            int grade = scanner.nextInt();

            if (grade >= 88 && grade <= 100) {
                System.out.println("Your grade is an A.");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("Your grade is a B.");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("Your grade is a C.");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("Your grade is a D.");
            } else {
                System.out.println("Your grade is an F.");
            }

            System.out.print("Do you want to continue? (yes or no): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));

    }
}
