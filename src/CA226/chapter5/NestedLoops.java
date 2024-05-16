package CA226.chapter5;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        //nested loops
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter multiplication number:");
        int n = scanner.nextInt();
        //loops
        for(int i = 1; i <= n; i++) { //outer loop
            for(int j = 1; j <= 10; j++) { //inner loop
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("---------------------");
        }
    }
}
