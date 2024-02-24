package CA2212;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double result = Math.pow(num1, num2);
        System.out.println("result = " + result);

    }
}
