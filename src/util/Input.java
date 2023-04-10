package util;

import java.util.Scanner;
//public class Input {
//        private Scanner scanner;
//
//        public Input() {
//            this.scanner = new Scanner(System.in);
//        }
//        public String getString(){
//            System.out.print("Type something: ");
//            return scanner.nextLine();
//        }
//
//        public boolean yeNah(){
//            System.out.print("ye or nah?");
//            String input = scanner.nextLine().toLowerCase();
//            return input.equals("y")|| input.equals("ye");
//        }
//}


public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num >= min && num <= max) {
                    return num;
                }
            } catch (NumberFormatException e) {
                // do nothing, just keep looping
            }
            System.out.print("Please enter an integer between " + min + " and " + max + ": ");
        }
    }

    public int getInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                // do nothing, just keep looping
            }
            System.out.print("Please enter an integer: ");
        }
    }

    public double getDouble(double min, double max) {
        while (true) {
            try {
                double num = Double.parseDouble(scanner.nextLine());
                if (num >= min && num <= max) {
                    return num;
                }
            } catch (NumberFormatException e) {
                // do nothing, just keep looping
            }
            System.out.print("Please enter a decimal number between " + min + " and " + max + ": ");
        }
    }

    public double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                // do nothing, just keep looping
            }
            System.out.print("Please enter a decimal number: ");
        }
    }

    public void promptUser() {

        System.out.print("Enter a string: ");
        String str = getString();
        System.out.println("You entered: " + str);

        System.out.print("Enter yes or no: ");
        boolean yn = yesNo();
        System.out.println("You entered: " + yn);

        System.out.print("Enter an integer between 1 and 10: ");
        int intRange = getInt(1, 10);
        System.out.println("You entered: " + intRange);

        System.out.print("Enter an integer: ");
        int intVal = getInt();
        System.out.println("You entered: " + intVal);

        System.out.print("Enter a decimal number between 1.0 and 10.0: ");
        double doubleRange = getDouble(1.0, 10.0);
        System.out.println("You entered: " + doubleRange);

        System.out.print("Enter a decimal number: ");
        double doubleVal = getDouble();
        System.out.println("You entered: " + doubleVal);
    }

}