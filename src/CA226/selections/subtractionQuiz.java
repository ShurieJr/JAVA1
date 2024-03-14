package CA226.selections;

import java.util.Scanner;

public class subtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //generate two random numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //check if number1 < number2 -- swapping
        if (number1 < number2) {
            //swap
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        //answer
        System.out.println("What is " + number1 + " - " + number2);
        int answer = input.nextInt();

        //display result
        if (answer == (number1 - number2))
            System.out.println("Correct! congrats!");
        else {
            System.out.println("Wrong answer!");
            System.out.println("The result is:  " + (number1 - number2));
        }

    }
}
