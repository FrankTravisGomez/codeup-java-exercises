import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        System.out.print("Ask Bob a question? ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        if (input.endsWith("?")) {
            System.out.println("Sure.");
        } else if (input.endWitrh("!")){
            System.out.println("Whoa, chill out!");
        }else if(input.endWitrh("")){
            System.out.println("'Fine. Be that way!");
        }else {
            System.out.println("Whatever.");
        }
    }
}


