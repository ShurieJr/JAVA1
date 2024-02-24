package CA2212;

import java.util.Scanner;

public class DisplayAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //constant variable
       final int SIZE = 40; //PERMENANT VARIABLE


        //declare variable and initialize
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        //display age
        System.out.println("you are " + age + " years old");
    }
}
