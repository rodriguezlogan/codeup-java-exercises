package util;

import java.util.Scanner;

public class Input {

    private Scanner scan;

    public Input(){
        this.scan = new Scanner(System.in);
    }

    public String getString(){
        return this.scan.nextLine();
    }

    public boolean yesNo(){
        String yesNo = scan.nextLine();
        if(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userNum = Integer.valueOf(this.getString());
        if(userNum > min && userNum <max){
            return userNum;
        }
        System.out.println("Integer not between bounds. Enter integer: ");
        return getInt(min, max, prompt);
    }

    public int getInt(int i, int i1){
        return this.scan.nextInt();
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        double userNum = Double.valueOf(this.getString());
        if(userNum > min && userNum <max){
            return userNum;
        }
        System.out.println("Double not between bounds. Enter double: ");
        return getDouble(min, max, prompt);
    }


    public double getDouble(){
        return this.scan.nextDouble();
    }



    public static void main(String[] args){
        Input inputOne = new Input();
//        System.out.println("Enter String: ");
//        System.out.println(inputOne.getString());
//
//        System.out.println("yes or no");
//        System.out.println(inputOne.yesNo());

//        System.out.println("give me a number");
//        System.out.println(inputOne.getInt(1,10));
        System.out.println(inputOne.getDouble(1,10, "Give a number 1-10"));

    }

}
