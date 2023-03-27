public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //1)below is my favorite number
        int myFavoriteNumber = 1738;
        System.out.println(myFavoriteNumber);
        //2)no we have an output for a string
        String myString = "good so far.";
        System.out.println(myString);
// 3)       char myString = 'H';
//        System.out.println(myString); made an error

// 4)       String myString = 3.14159;
//        System.out.println(myString); made an error

// 5)       long myNumber;
//        System.out.println(myNumber); made an error

//        long myNumber = ;
//        System.out.println(myNumber);

// 6)       long myNumber = 3.14;
//        System.out.println(myNumber); made an error

        //7)
//        long myNumber = 123L;
//        System.out.println(myNumber);

        //8)
//        long myNumber = 123;
//        System.out.println(myNumber);
        // 3.14 won't convert, I think it has to do with it being a double

        //9)
//        float myNumber = 3.14;
//        System.out.println(myNumber); another error Single-precision,
//        floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
         double myNumber= 3.14;
         System.out.println(myNumber);

        //10)
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x); // this line of code counts up ++ comes after x like so x++

        int x = 5;
        System.out.println(++x);
        System.out.println(x); // this line of code starts at 6 because the placement of ++X

        //11)

        //12)
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; came back as an error

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three"; lang string cannot be converted

        //13)
//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;


    }
}
