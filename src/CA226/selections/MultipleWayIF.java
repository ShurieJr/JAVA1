package CA226.selections;

import java.util.Scanner;

public class MultipleWayIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in Kg:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your Height in meters:");
        double height = scanner.nextDouble();

        //calculate the BMI
        double bmi = weight / (height * height);

        //display the results
        System.out.println("BMI: "+ bmi);
        if(bmi < 18.5)
            System.out.println("underweight!");
        else if(bmi < 25)
            System.out.println("Normal");
        else if(bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese!");
    }
}
