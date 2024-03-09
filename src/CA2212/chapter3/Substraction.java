package CA2212.chapter3;

import java.util.Scanner;

public class Substraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //2 check if number1 is greater than number2 , swapping
        if(number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        //3 question
        System.out.println("what is " + number1 + " - " + number2 );
        int answer = scanner.nextInt();

        //4. display result
        if(number1 - number2 == answer)
            System.out.println("Correct answer!");
        else
            System.out.println("Wrong answer");
        System.out.println(number1 + " - " +  number2 +
                " is equal to " + (number1 - number2));

    }
}
