package util;

import java.util.Scanner;
public class Input {
        private Scanner scanner;

        public Input() {
            this.scanner = new Scanner(System.in);
        }
        public String getString(){
            System.out.print("Type something: ");
            return scanner.nextLine();
        }

        public boolean yeNah(){
            System.out.print("ye or nah?");
            String input = scanner.nextLine().toLowerCase();
            return input.equals("y")|| input.equals("ye");
        }
}
