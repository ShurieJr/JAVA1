package CA226;


import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner (System.in);

        //prompt
        System.out.println("Enter three subject marks: ");
        double java = input.nextDouble();
        double html = input.nextDouble();
        double flutter = input.nextDouble();

        //compute average
        double average = (java + html + flutter) / 3;

        //display result
        System.out.println("The average of java: " + java + " , html: " +
                html + " and flutter " + flutter + " is: " + average);

        //total
        System.out.println("The total is: " + (java + html + flutter));
    }
}
