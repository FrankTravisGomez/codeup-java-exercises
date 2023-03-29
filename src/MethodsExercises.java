import java.util.Scanner;


public class MethodsExercises {

    public static void main(String[] args){
        int a = 10, b = 5;
        System.out.println(addition(a, b));
        System.out.println(subtraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(division(a, b));
        System.out.println(modulus(a, b));
        System.out.println(multiply(a, b));
        Scanner scanner = new Scanner(System.in);
        System.out.println(getInteger(5, 50, scanner));
    }

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

}

