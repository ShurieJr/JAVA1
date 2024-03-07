package CA2212.chapter3;

import java.util.Scanner;

public class Selections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        System.out.println("What is " + number1 + " + " + number2);
        int answer = scanner.nextInt();

        //display results
        System.out.println(number1 + " + " +  number2 + " = " + answer +
                " : " +  (number1 + number2 == answer));

    }
}
