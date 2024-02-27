package CA2212;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName , lastName , fullName;

        System.out.println("Enter first name: ");
        firstName = scanner.next();
        System.out.println("Enter last name: ");
        lastName = scanner.next();

        //display fullname
        fullName = firstName + " " + lastName ;
        System.out.println("Full name: " + fullName);
    }
}
