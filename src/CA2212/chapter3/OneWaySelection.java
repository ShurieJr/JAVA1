package CA2212.chapter3;

import java.util.Scanner;

public class OneWaySelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number: ");  //prompt
        int number = scanner.nextInt();

        //if
        if( number % 5 == 0 ) {
            System.out.println("HiFive!");
        }

        if( number % 2 == 0 ) {
            System.out.println("HiEven!");
        }
    }
}
