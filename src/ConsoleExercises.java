import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %s %n", pi);

//        System.out.println("Enter a number");
//        int userInput = sc.nextInt();
//        System.out.println(userInput);
//        String first = sc.nextLine();
//        String second = sc.nextLine();
//        String third = sc.nextLine();
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
        System.out.println("Enter a length");
        int length = sc.nextInt();
        System.out.println("Enter a width");
        int width = sc.nextInt();
        System.out.println("Your rectangle has a width of " + length + " and a width of "+ width + " meaning the area is " + (length*width) + " and has a perimeter of " + ((length*2)+(width*2)));


    }
}
