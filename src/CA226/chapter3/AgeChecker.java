package CA226.chapter3;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        //check if the age is valid or not
        if (age < 1)
            System.out.println("Please enter a valid age!");
        else{
            if(age >= 60)
                System.out.println("your are an elder! ");
            else if (age >= 15)
                System.out.println("You are an adult!");
            else
                System.out.println("you are a teenager!");
        }
    }
}
