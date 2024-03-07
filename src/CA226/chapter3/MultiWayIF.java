package CA226.chapter3;

import java.util.Scanner;

public class MultiWayIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you grade: ");
        double grade = scanner.nextDouble();

        if (grade < 0){
            System.out.println("invalid grade!");
            System.out.println("Grade must be between 0 and 100");
            }
        else if (grade > 100)
            System.out.println("invalid grade! GraAde must be between 0 and 100");
        else {
            //        //multiway if else
            if (grade >= 90)
                System.out.println("A");
            else if (grade >= 80)
                System.out.println("B");
            else if (grade >= 70)
                System.out.println("C");
            else if (grade >= 60)
                System.out.println("D");
            else
                System.out.println("F");
        }


    }
}
