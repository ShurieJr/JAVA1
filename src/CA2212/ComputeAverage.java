package CA2212;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        //1.Scanner object
        Scanner in = new Scanner(System.in);

        //2. declare variables and initialize
        System.out.println("Enter subject marks: ");
        double java = in.nextDouble();
        double html = in.nextDouble();
        double flutter = in.nextDouble();

        //3. compute average
        double average = (java + html + flutter) / 3;

        //compute total
        double total = java + html + flutter;

        //4. display result
        System.out.println("EXam Information.");
        System.out.println("Java: " + java);
        System.out.println("html: " + html);
        System.out.println("flutter: " + flutter);

        System.out.println("Total: " + total);

        System.out.println("Average : " + average);
    }
}
