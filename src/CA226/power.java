package CA226;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        //System.out.println(Math.pow(2 , 5));

//        int guess = (int) (Math.random() * 70);
//        System.out.println(guess);
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        //initial
        System.out.println("Enter number 1: ");
        num1=input.nextDouble();
        System.out.println("Enter number 2: ");
        num2=input.nextDouble();
        //display
        System.out.println(Math.pow(num1, num2));

    }
}
