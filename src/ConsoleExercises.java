import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi + ".");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You entered: " + num);

        System.out.print("Enter word 1: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter word 2: ");
        String word2 = scanner.nextLine();

        System.out.print("Enter word 3: ");
        String word3 = scanner.nextLine();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        System.out.print("what is the length of the room? ");
        String lengthStr = scanner.nextLine();
        double length = Double.parseDouble(lengthStr);

        System.out.print("what is the width of the room? ");
        String widthStr = scanner.nextLine();
        double width = Double.parseDouble(widthStr);

        double area = length * width;

        System.out.println(" the area of your room is " + area + "square ft");

        System.out.print("what is the lengthTwo of the room? ");
        String lengthStrTwo = scanner.nextLine();
        double lengthTwo = Double.parseDouble(lengthStrTwo);

        System.out.print("what is the width of the room? ");
        String widthStrTwo = scanner.nextLine();
        double widthTwo = Double.parseDouble(widthStrTwo);

        double areaTwo = lengthTwo * widthTwo;

        double perimeter = 2 * (length + width);

        System.out.println("The area of the room is " + areaTwo + " square ft.");
        System.out.println("The perimeter of the room is " + perimeter + " square ft.");

    }
}
