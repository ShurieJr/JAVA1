package CA2212.cHPATER_5_loops;

import java.util.Scanner;

public class powerUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        double number = scanner.nextDouble();
        System.out.println("Enter power :");
        double power = scanner.nextDouble();

        double result = 1;
        //loop
        for(int i = 0; i < power; i++){
            result = result * number;
        }
//        for(;  power != 0 ; --power){
//            //result = result * number;
//            result  *= number;
//        }
        //display result
        System.out.println("Result : " + result);
    }
}
