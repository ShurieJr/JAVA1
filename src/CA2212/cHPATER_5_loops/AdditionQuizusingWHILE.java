package CA2212.cHPATER_5_loops;

import java.util.Scanner;

public class AdditionQuizusingWHILE {
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        //generate two random numbers
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);

        System.out.println("number 1:" + number1);
        System.out.println("number 2:" + number2);

        //prompt
        System.out.println("what is " + number1 + " + " +
                number2 );
        int answer = input.nextInt();

        //loop
        while ( number1 + number2 != answer ){
            System.out.println("wrong answer! plz try again");
            answer = input.nextInt();
        }

        //ouptput
        System.out.println("you got it!");


    }
}
