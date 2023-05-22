import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f. %n", pi);

//        System.out.println("Enter a number:");
//        int userInput = sc.nextInt();
//        System.out.println(userInput);
//        System.out.println("Enter three words:");
//        String first = sc.next();
//        String second = sc.next();
//        String third = sc.next();
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        System.out.println("Enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("Enter a length:");
        String length = sc.nextLine();
        System.out.println("Enter a width:");
        String width = sc.nextLine();

        int newLength = parseInt(length);
        int newWidth = parseInt(width);

        System.out.println("Your rectangle has a width of " + newLength + " and a width of "+ newWidth + " meaning the area is " + (newLength*newWidth) + " and has a perimeter of " + ((newLength*2)+(newWidth*2)));


    }
}
