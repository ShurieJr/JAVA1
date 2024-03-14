package CA226.selections;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight in kg:");
        double weight = scanner.nextDouble();

        //check
        if(age >=  18){
            //nested  if
            if(weight > 50)
                System.out.println("you are eligible to donate a blood!");
            else
                System.out.println("you are not eligible to donate a blood" +
                        " , your weight must be greater than 50 ");
        }
        else
            System.out.println("age must be greater than 17!");
    }
}
