import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        if(userInput.equals("")){
            System.out.println("Fine. Be that way!");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else {
            System.out.println("Whatever.");
        }


    }
}
