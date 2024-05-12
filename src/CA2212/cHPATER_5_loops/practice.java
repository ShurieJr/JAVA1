package CA2212.cHPATER_5_loops;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //practice
        int randomNumber = (int) (Math.random() * 70);

        System.out.println(randomNumber);
        //Abdifatah Abdirashid Ibrahim  -- absent

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int zeroCounter = 0,plusCounter = 0,MinusCounter = 0;
//        for(int i = 0; i <10 ; i++) {
//            System.out.println("Enter number:");
//            number = scanner.nextInt();
//            //check
//            if(number == 0)
//                zeroCounter++;
//            else if(number <0)
//                MinusCounter++;
//            else if (number > 0 )
//                plusCounter++;
//        }

        //Display results
        System.out.println("Zero :" + zeroCounter);
        System.out.println("Plus :" + plusCounter);
        System.out.println("Minus :" + MinusCounter);

        ///example 2
        for(int i= 1 ; i<= 5; i++){ //outer loop
            for(int j= 1 ; j<=i; j++){ //inner loop
                System.out.print("*");
            }
            System.out.println("");
        }


        ///---
        System.out.println("\n");
        for(int i= 5 ; i>= 1; i--){ //outer loop
            for(int j= 1 ; j<=i; j++){ //inner loop
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
