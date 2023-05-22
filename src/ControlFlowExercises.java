import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

//        int i = 5;
//        while(i<=15){
//            System.out.print(i + " ");
//            i++;
//        }
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        }while(i<=100);
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }while(i>=-10);
//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        }while(i<=1_000_000);
//        for(int i = 100; i>=-10; i-=5){
//            System.out.println(i);
//        }
//        for (long i = 2; i<1000000; i*=i){
//            System.out.println(i);
//        }
//        for(int i = 1; i<=100; i++){
//            if (i%5 == 0 && i%3==0) {
//                System.out.println("FizzBizz");
//            } else if (i%5 == 0) {
//                System.out.println("Buzz");
//            } else if (i%3==0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }
//
//        }

        Scanner scan = new Scanner(System.in);
        boolean confirm = true;
//        do {
//            System.out.println("What number do you want to go up to?");
//            int i = scan.nextInt();
//            System.out.println("Here is your table");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int j = 1; j <= i; j++) {
//                int square = j * j;
//                int cubed = j * j * j;
//                System.out.printf("%-7s|%-9s|%-6s\n", j, square, cubed);
//
//
//            }
//            System.out.println("Continue? [y/n]");
//            confirm = scan.next().equalsIgnoreCase("y");
//        }while (confirm);
//        System.out.println("See you later");
        do {
            System.out.println("Enter a numerical grade from 0 - 100:");
            int userGrade = scan.nextInt();
            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Continue? [y/n]");
            confirm = scan.next().equalsIgnoreCase("y");
        }while (confirm);
    }
}
