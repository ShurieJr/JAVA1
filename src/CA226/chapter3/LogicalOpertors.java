package CA226.chapter3;

import java.util.Scanner;

public class LogicalOpertors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter number
        System.out.println("Enter number : ");
        int number = input.nextInt();

        //checking
        if ( number % 2 ==0 && number % 3 == 0)
            System.out.println(number + " is divisible by 2 and 3");

        if(number % 2 == 0  || number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3");

        if(number % 2 == 0 ^ number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3 , but not both");


    }
}
