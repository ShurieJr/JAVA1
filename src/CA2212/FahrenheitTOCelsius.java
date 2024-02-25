package CA2212;

import java.util.Scanner;

public class FahrenheitTOCelsius {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Enter the temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        //covert into celsius
        float celsius = (5.0f / 9 ) * ( fahrenheit - 32 );

        //display temperature in celsius
        System.out.println("Celsius: " + celsius);
    }
}
