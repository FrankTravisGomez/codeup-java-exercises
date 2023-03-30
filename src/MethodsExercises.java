import java.util.Scanner;


public class MethodsExercises {

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(addition(a, b));
        System.out.println(subtraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(division(a, b));
        System.out.println(modulus(a, b));
        System.out.println(multiply(a, b));
        Scanner scanner = new Scanner(System.in);
        System.out.println(getInteger(5, 50, scanner));
        System.out.println(factor(1, 10));
        DiceRoller.play();
    }
//1)
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {

        }
        return a / b;

    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    public static int multiply(int num1, int num2) {
//        int result = 0;
//        boolean negative = false;
//        if (num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0) {
//            negative = true;
//        }
//        num1 = Math.abs(num1);
//        num2 = Math.abs(num2);
//        for (int i = 0; i < num2; i++) {
//            result += num1;
//        }
//        return negative ? -result : result;
//    }

    public static int multiply(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        if (num2 < 0) {
            return -multiply(num1, -num2);
        }
        return num1 + multiply(num1, num2 - 1);
    }

        //2)
    public static int getInteger(int min, int max, Scanner scanner) {
        System.out.print("Enter a number between " + min + " and " + max + ":");
        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("re enter a number");
            return getInteger(min, max, scanner);
        }
    }

        //3)
    public static long factor(int min, int max) {
        boolean calculate = true;
        int number;
        long factor = 1;
        do {
            System.out.print("Enter an integer between 1 and 10: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        for (int i = 1; i <= number; i++) {
            factor *= i;
        }
        System.out.println(number + "! = " + factor);

        System.out.print("Do you want to continue? (yay or nay?): ");
        Scanner scanner = new Scanner(System.in);
        String continueResponse = scanner.next();
        calculate = continueResponse.equalsIgnoreCase("yay");
        if (calculate) {
            return factor(min, max);
        } else {
            return factor;
        }
    }
    //4)
    public static class DiceRoller {
        public static void play() {
            Scanner scanner = new Scanner(System.in);
            int numSides = sides(scanner);
            do {
                rollDice(numSides);
            } while (rollAgain(scanner));
            System.out.println("Thanks for playing!");
        }

        private static int sides(Scanner scanner) {
            System.out.print("Enter the number of sides for a pair of dice: ");
            return scanner.nextInt();
        }

        private static boolean rollAgain(Scanner scanner) {
            System.out.print("roll again? (y/n): ");
            String answer = scanner.next();
            return answer.equalsIgnoreCase("y");
        }

        private static void rollDice(int numSides) {
            int die1 = (int) (Math.random() * numSides) + 1;
            int die2 = (int) (Math.random() * numSides) + 1;
            System.out.println("You rolled a " + die1 + " and a " + die2);
        }
    }
}