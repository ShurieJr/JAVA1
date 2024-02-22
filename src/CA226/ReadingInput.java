package CA226;

import java.util.Scanner;

//to read input from the user
public class ReadingInput {
    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);

        //declare radius & area of a circle
        double radius;
        double area;

        //assign radius
//        radius = 20 ;
        System.out.println(" Enter radius : ");
        radius = input.nextDouble();

        //compute area
        area = radius * radius * 3.14159 ; //Math.PI
        //DISPLAY result
        System.out.println( "The area for the circle of " +
                radius + " is: " + area);
    }
}
