package CA226.chapter3;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight :");
        double weight = scanner.nextDouble();

        //check if the person is eligible

        if(age >= 18){

            if(weight > 50)
                System.out.println("you are eligible!");
            else{
                System.out.println("you are not eligible!");
            }
        }
        else{
            System.out.println("You are not eligible to donate blood!");
        }
    }
}
