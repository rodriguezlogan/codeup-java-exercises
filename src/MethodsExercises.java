import java.util.Scanner;

public class MethodsExercises {
    private static final Scanner scan = new Scanner(System.in);

    public static double Addition(double x, double y){
        return (x+y);
    }

    public static double Subtraction(double x, double y){
        return (x-y);
    }

    public static double Multiplication(double x, double y){
//        return (x*y);
//        int sum = 0;
//        for (int i = 0; i<y; i++){
//            sum += x;
//        }
//        return sum;
        if(x == 0)
        {
            return 0;
        } else if (x== 1){
            return y;
        }
        return y + Multiplication(x-1, y);
    }

    public static double Division(double x, double y) {
            return (x / y);
    }

    public static int getInteger(int min, int max){
        int anInt = scan.nextInt();
        if(anInt< min || anInt > max){
            System.out.printf("That was not between %d and %d! Try again. \n", min, max);
            return getInteger(min, max);
        }
        return anInt;
    }

    private static void factorials(){
        while(true) {
            System.out.println("Enter a number 1 - 10");
            int factBase = getInteger(1, 10);
            scan.nextLine();
            System.out.println(fact(factBase));
            if(!promptToContinue()){
                return;
            }
        }
    }

    private static int fact(int num) {
        if(num == 1){
            return num;
        }
        return num * fact(num-1);

    }
private static boolean promptToContinue(){
    System.out.println("Continue? y/n");
    String continueString = scan.nextLine();
    if (!continueString.equalsIgnoreCase("y")) {
        return false;
    }
    return true;
}

private static void diceRoll(){
    System.out.println("Enter the number of sides on the die: ");

    int sides = getInteger(4, 20);
    System.out.println("Press enter to roll some dice!");
    scan.nextLine();
    int result = rollADie(sides) + rollADie(sides);
    System.out.println("You rolled a " + result);
}

    private static int rollADie(int sides) {
        int result = (int) (Math.random()* sides + 1);
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(Addition(2,2)+ " " +Subtraction(2,2) + " " + Multiplication(2,2) + " " + Division(2,2));
//        System.out.println(Division(3,0));
//        System.out.println(Multiplication(3,4));
//        System.out.println(getInteger(1,10));
//        factorials();
//        diceRoll();



    }
}
