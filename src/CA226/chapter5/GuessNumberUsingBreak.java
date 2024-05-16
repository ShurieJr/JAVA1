package CA226.chapter5;

import java.util.Scanner;

public class GuessNumberUsingBreak {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int number = (int) (Math.random()* 10);
        System.out.println("Number:" + number);

        //loop
        while(true){
            System.out.println("Enter number:");
            int guess = input.nextInt() ;

            if(guess == number){
                System.out.println("bravo!");
                break;
            }
            else if(guess > number)
                System.out.println("too high");
            else
                System.out.println("too low");

        }

    }
}
