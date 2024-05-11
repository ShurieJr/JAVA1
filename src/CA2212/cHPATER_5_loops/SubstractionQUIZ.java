package CA2212.cHPATER_5_loops;

import java.util.Scanner;

public class SubstractionQUIZ {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //generate random number
        int number = (int) (Math.random() * 10);
        //variable
        int guess = -1;
        System.out.println("number: " + number);
        int counter = 0;

//        //display the result
//        if(guess != number) {
//            System.out.println("you didn't get  it!");
//        }
//        else
//            System.out.println("you got it!");
        while(true){
            //promt
            System.out.println("Guess the number:");
            guess = input.nextInt();

            if(guess > number){
                System.out.println("too high!");

            }
            else if(guess < number){
                System.out.println("too low!");

            }
            else{
                System.out.println("you got it!");
            break;
            }

//            //check the attempts (3)
//            if(counter == 3)
//                break;

        }
    }
}
