import java.awt.*;
import java.util.Arrays;

public class Main {

    /*  How to build methods:
        - Access Modifier
        - Optional Static
        - Return Type : if 'void', did not return anything
        - Name
        - Optional Parameters
        - Method Body
        - Optional Return Value
     */
    /* Method1 */
//    private static int add(int n1, int n2) {
//        /* Method Body */
//        return n1 + n2;
//    }

    /* Method2 */
    private int add(int n1, int n2) {
        /* Method Body */
        return n1 + n2;
    }

    /////////////////////////////////////////////////////////

    public static void main(String[] args) {
        /* Usage of Method1 */
//        int result1 = add(10, 20);
//        System.out.println(result1);
//        int result2 = add(30, 40);
//        System.out.println(result2);
//        System.out.println();

        /* Usage of Method2 */
        Main main = new Main();
        int result3 = main.add(50, 60);
        System.out.println(result3);
        System.out.println();

        /////////////////////////////////////////////////////////

        System.out.println("Java Tutorial Start!!");

        // Single Line Comment
        /*
            Multi Line Comment
        */

        System.out.println("Hello world! 🎉");

        /*
            Shortcut: sout, ...
         */
        System.out.println(); // empty line

        /*
            Reserved Keywords: public, class, static, void, ...
         */

        /* Data Types, Variables */
        /*
            --- Primitives Types ---
            : byte(8), short(16), int(32), long(64), float(32), double(64), boolean, char
         */
        System.out.println("Data Types, Variables");
        System.out.println();
        System.out.println("--- Primitive Types ---");

        // byte b1 = 128; // out of size
        byte b2 = 127; // -128 ~ 127
        // short s1 = 32768; // out of size
        short s2 = 32767; // -32768 ~ 32767
        // int i1 = 2147483648; // out of size
        int i2 = 2147483647; // -2147483648 ~ 2147483647
        double pi = 3.14;
        boolean isReal = true;
        char c = 'A';
        String str = "A";

        int amount1 = 1000000008;
        System.out.println(amount1);
        double amount2 = 1_000_000_008.00;
        System.out.println(amount2);
        System.out.println();

        System.out.println("Arithmetic Operations");
        int numberOne = 10;
        int numberTwo = 20;
        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne % numberTwo);
        System.out.println((double)numberOne / (double)numberTwo); // type casting
        System.out.println(numberTwo / numberOne);
        System.out.println();

        /*
            BODMAS:
            - Brackets
            - Orders(powers - indices or roots)
            - Division or Multiplication
            - Addition or Subtraction
         */
        System.out.println((2 + 2) * (3 / 1) * 2);
        System.out.println();

        /*
            Increment or Decrement Operator: ++, --, +=, -=, *=
         */
        System.out.println("Increment or Decrement Operator");
        int number1 = 0;
        // int increment = number1 + 1;
        // int decrement = number1 - 1;
        // System.out.println(increment);
        // System.out.println(decrement);
        // System.out.println();
        System.out.println(number1 ++);
        System.out.println(number1);
        System.out.println();
        System.out.println(number1 --);
        System.out.println(number1);
        System.out.println();

        int number2 = 0;
        System.out.println(++ number2);
        System.out.println(number2);
        System.out.println();
        System.out.println(-- number2);
        System.out.println(number2);
        System.out.println();

        int number3 = 2;
        number3 = number3 + 3;
        System.out.println(number3);
        number3 += 3;
        System.out.println(number3);
        System.out.println();

        int number4 = 10;
        number4 = number4 - 3;
        System.out.println(number4);
        number4 -= 3;
        System.out.println(number4);
        System.out.println();

        number4 += number3;
        System.out.println(number4);
        number4 -= number3;
        System.out.println(number4);
        System.out.println();

        number4 *= number3;
        System.out.println(number4);
        number4 /= number3;
        System.out.println(number4);
        number4 %= number3;
        System.out.println(number4);
        System.out.println();

        /*
            Comparison Operator: >, >=, <, <=, ==, !=
         */
        System.out.println("Comparison Operator");
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println();
        System.out.println(10 < 10);
        System.out.println(10 <= 10);
        System.out.println();
        System.out.println(10 == 10);
        System.out.println(10 != 10);
        System.out.println();

        boolean isAdult = 15 >= 16;
        System.out.println(isAdult);
        isAdult = 16 >= 16;
        System.out.println(isAdult);
        System.out.println();

        /*
            Naming Variable
         */
        System.out.println("Naming Variable");
        int goals = 1;
        int numberOfGoals = 2;
        boolean isOdd = true;
        boolean hasCat = false;
        System.out.println();

        /*
            --- Reference Types ---
            : Strings, Objects(Point, ... ), Arrays,
        */
        System.out.println("--- Reference Types ---");
        System.out.println("Strings");
        System.out.println();

        String yourName = "Charlie";
        String yourBrand = "Factory";
        String brandName = yourName + yourBrand;
        System.out.println(brandName);
        String yourNumber1 = "1";
        String yourNumber2 = "2";
        String yourNumber = yourNumber1 + yourNumber2;
        System.out.println(yourNumber); // "12"
        System.out.println();

        System.out.println(brandName.toUpperCase());
        System.out.println(brandName.toLowerCase());
        System.out.println(brandName.substring(7));
        System.out.println(brandName.substring(0, 7));
        System.out.println();

        System.out.println("   ".isEmpty()); // false
        System.out.println("".isEmpty());    // true
        System.out.println("   ".isBlank()); // true
        System.out.println("".isBlank());    // true
        System.out.println();

        System.out.println("   a   ".trim());
        System.out.println();

        System.out.println("Objects");
        System.out.println();

        /* import java.awt.*; */
        Point pointA = new Point(10, 10);
        System.out.println(pointA);

        pointA.move(10, 11);
        System.out.println(pointA);

        Point pointB = new Point(20, 20);
        System.out.println();

        /* import java.util.Arrays; */
        System.out.println("Arrays");
        System.out.println();

        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 3;
        numbers1[2] = 5;
        // numbers[3] = 7; // ArrayIndexOutOfBoundsException
        System.out.println(numbers1);
        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers1.length);
        System.out.println();

        int[] numbers2 = {2, 4, 6, 8};
        System.out.println(numbers2);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        numbers2[0] = 52;
        System.out.println(Arrays.toString(numbers2));
        System.out.println();

        double[] numbers3 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(numbers3));

        String[] names1 = {"Charlie", "Lee"};
        System.out.println(Arrays.toString(names1));
        System.out.println();

        System.out.println("Arrays null values");
        int[] numbers4 = new int[3];
        numbers4[0] = 2;
        System.out.println(Arrays.toString(numbers4));
        System.out.println();

        Arrays.fill(numbers4, -1);
        System.out.println(Arrays.toString(numbers4));
        numbers4[2] = 27;
        System.out.println(Arrays.toString(numbers4));
        System.out.println();

        String[] names2 = new String[3];
        names2[1] = "Jamila";
        System.out.println(Arrays.toString(names2));
        Arrays.fill(names2, "foo");
        System.out.println(Arrays.toString(names2));
        System.out.println();

        /*
            Loops and Arrays
         */
        System.out.println("Loops and Arrays");
        String[] names3 = {
                "James",
                "Nadia",
                "Sophia",
                "Alex",
                "Saleh"
        };
        System.out.println(names3);
        System.out.println(Arrays.toString(names3));
        System.out.println();

        // System.out.println(names3[0]);
        // System.out.println(names3[1]);
        // System.out.println(names3[2]);
        // System.out.println(names3[3]);
        // System.out.println(names3[4]);
        // System.out.println();

        for (int i = 0; i < names3.length; i ++) {
            System.out.println(names3[i]);
        }
        System.out.println();

        /*
            If Statements
         */
        System.out.println("If Statements");
        if (true) {
            System.out.println("this code runs when true");
        } else {
            System.out.println("this code runs when false");
        }
        System.out.println();

        System.out.println("this code runs outside if");

        System.out.println();
        if (false) {
            System.out.println("this code runs when false");
        } else {
            System.out.println("this code runs when true");
        }

        /*
            Packages
         */
        System.out.println("Packages");
        /* import java.util.Arrays; */
        System.out.println();

        /////////////////////////////////////////////////////////
        /*
            Classes
        */
        Cat cat = new Cat();
        cat.meow();

    }

    /////////////////////////////////////////////////////////
    /*
        Classes
    */
    static class Cat {
        String name;
        void meow() {
            System.out.println(name + ": meow...");
        }
    }
}