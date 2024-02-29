package CA2212;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  /// Scanner object

        //variables
        double number1;
        int number2;

        System.out.println("Enter double number : ");
        number1 = input.nextDouble();

        System.out.println("Enter an integer NUMBER : ");
        number2 = input.nextInt();

        System.out.println("Before Swapping :");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        //Swapping
        double temp = number1;
        number1 = number2;
        number2 = (int) temp;

        System.out.println("After Swapping :");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);


    }
}
