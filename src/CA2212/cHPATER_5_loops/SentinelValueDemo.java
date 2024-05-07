package CA2212.cHPATER_5_loops;

import java.util.Scanner;

public class SentinelValueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variables
        int data ;
        int total = 0;

        //prompt
        System.out.println("Enter data , ( 0 to end) :");
        data = input.nextInt();
        //loop
        while (data != 0) {  //sentinel value
            //body of the loop
            total += data;

            //prompt
            System.out.println("Enter data , ( 0 to end) :");
            data = input.nextInt();
        }

        //display total
        System.out.println("Total : " + total);

    }
}
