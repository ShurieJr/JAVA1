package CA2212.chapter3;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter weight and height
        System.out.println("Enter your weight in Kg: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in Meter: ");
        double height = scanner.nextDouble();

        //calculate the  BMI
        double bmi = weight / (height * height);

        System.out.println("bmi = " + bmi);

        if(bmi < 18.5)
            System.out.println("UnderWeight");
        else if(bmi < 25)
            System.out.println("Normal");
        else if (bmi <30)
            System.out.println("OverWeight");
        else
            System.out.println("Obese");

    }
}
