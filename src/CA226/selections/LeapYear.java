package CA226.selections;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year as integer:");
        int year = input.nextInt();

        //leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        boolean isLeapYear;
//        if(  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//            isLeapYear = true;
//        else
//            isLeapYear = false;

        System.out.println(year + " is a leap year : " + isLeapYear);

    }
}
