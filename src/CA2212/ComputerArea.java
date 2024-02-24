package CA2212;

import java.util.*;  //implicit import

public class ComputerArea {
    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);

        // Create variables

        double area;

        //initialize variable radius
        System.out.println("Enter radius: ");  //prompt for radius
        double radius = input.nextDouble();

        //compute area
        area = radius * radius * Math.PI;

        //Display result
        System.out.println("The area for the Circle " + radius + " is: " + area);
    }
}
