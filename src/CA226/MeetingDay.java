package CA226;

import java.util.Scanner;

public class MeetingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //varibables
        int toDay , meetingDay;
        final int DOW = 7;  // Days of the week

        System.out.println("Enter todya as Number: ");
        toDay = scanner.nextInt();

        //meeting day
        meetingDay = (toDay + 10 ) % DOW;

        //display results
        System.out.println("Meeting day: " + meetingDay);

    }
}
