package CA2212.chapter3;

import java.util.Scanner;

public class TwoWaySlection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        //if else
        if (age > 50) {
            System.out.println("old");
        }
         if (age < 50 && age > 0) {
            System.out.println("Youth");
        }
        else{
            System.out.println("Invalid age !");
        }
    }
}
