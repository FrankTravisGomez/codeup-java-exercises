
public class ServerNameGenerator {
    public static void main(String[] args) {

        String[][] enterTheMatrix = {
                {"adorable", "adventurous", "alert", "anxious", "bored", "annoying", "beautiful", "clean", "fair", "friendly"},

                {"park", "country", "person", "cat", "day", "company", "city", "hat", "phone", "banana"}, //nested arr2(containerArray[1])

        };
        int rand1 = (int) (Math.random() * 0);
        int rand2 = (int) (Math.random() * 9);

        int rand3 = (int) (Math.random() * 0);
        int rand4 = (int) (Math.random() * 9);

        System.out.println("something here " + enterTheMatrix[0][1]);

        System.out.printf("rand1: %d; rand2: %d %n", rand1, rand2);
        System.out.println("Here's what you got: " + enterTheMatrix[rand1][rand2] +" "+ enterTheMatrix [rand3][rand4]);

    }
}

