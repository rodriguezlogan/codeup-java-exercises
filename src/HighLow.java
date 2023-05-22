import java.util.Scanner;

public class HighLow {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int answer = rollADie(100);
        System.out.println(answer);
        System.out.println("You have 10 guesses");
        int guesses = 0;
        while (true && guesses<10) {
            System.out.println("Guess a number 1 to 100");
            int guess = getInteger(1, 100);
            if (checkGuess(guess, answer)) {
                break;
            }
            System.out.println("Guess number " + (guesses+1));
            guesses++;
        }
    }
    private static boolean checkGuess(int guess, int answer){
        if (guess == answer){
            System.out.println("You got it!!!");
            return true;
        } else if (guess > answer) {
            System.out.println("Too high!");
        }else {
            System.out.println("Too low!");
        }
        return false;
    }
    private static int rollADie(int sides) {
        int result = (int) (Math.random()* sides + 1);
        return result;
    }
    public static int getInteger(int min, int max){
        int anInt = scan.nextInt();
        if(anInt< min || anInt > max){
            System.out.printf("That was not between %d and %d! Try again. \n", min, max);
            return getInteger(min, max);
        }
        return anInt;
    }
}
