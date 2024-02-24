package CA2212;

import java.util.Scanner;

public class MeetingDay {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //variables
        int toDay , meetingDay;
        final int DOW = 7 ; //DAYS OF THE WEEK

        System.out.println("Enter today as number: ");
        toDay = input.nextInt();

        //Calculate
        meetingDay = (toDay + 10) % DOW;

        //display result
        System.out.println("Meeting day : " + meetingDay);
    }
}
