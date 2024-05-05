package CA2212.cHPATER_5_loops;

import java.util.Scanner;

public class MathLearningToolSub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTIONS = 5;
        int counter=0;
        int rightAnswer = 0 , wrongAnswer = 0;

        while(counter < NUMBER_OF_QUESTIONS){
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            //check if number1 < number2
            if (number1 < number2){
                //swapping
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            //prompt
            System.out.println("what is : " + number1 + " - " + number2);
            int answer = input.nextInt();

            if(answer == (number1 - number2)){
                System.out.println("Correct!");
                rightAnswer++;
            }
            else{
                wrongAnswer++;
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2) + "\n");
            }

            counter++;
        }

        //display results
        System.out.println("Right Answer: " + rightAnswer);
        System.out.println("Wrong Answer: " + wrongAnswer);
    }

}
