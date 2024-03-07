package CA226.chapter3;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();

        boolean checked;  // declartion
        //display results
        checked = number1 + number2 == answer; // initialization

//        if(number1 + number2 == answer)
//            checked = true;
//        else
//            checked = false;


        System.out.println(number1 + " + "+ number2 + " = " + answer +
                " is " + checked);
        if (checked) //(checked == true)
            System.out.println("Congratulations!");
        else
            System.out.println("The result is " + (number1 + number2));

    }
}
