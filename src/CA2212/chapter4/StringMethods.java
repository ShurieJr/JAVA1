package CA2212.chapter4;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Name:");
        String firstName = input.nextLine();
        System.out.println("Enter last Name:");
        String lastName = input.nextLine();

        String fullName = firstName + " " + lastName;
        System.out.println("Full Name:" + fullName);

        //string methods
        System.out.println("CharAt(2): " + fullName.charAt(2));
        System.out.println("IndexOf('h'): " + fullName.indexOf('h'));

        System.out.println("toUppercase: " + fullName.toUpperCase());
        System.out.println("tolowercase: " + fullName.toLowerCase());

        System.out.println("equals: "+ firstName.equals(lastName));
        System.out.println("equalsignoreCase: "+ firstName.equalsIgnoreCase(lastName));
        System.out.println("compareTo: " + firstName.compareTo(lastName));

        System.out.println("substring: " + fullName.substring(6));

        System.out.println("replace: " + fullName.replace(fullName , "omar gedi"));
    }
}
