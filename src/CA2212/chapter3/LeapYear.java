package CA2212.chapter3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //enter year
        System.out.println("Enter year: ");
        int year = input.nextInt();

        //check if year is a leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
        System.out.println(year + " is a leap year = " + isLeapYear);

    }
}
