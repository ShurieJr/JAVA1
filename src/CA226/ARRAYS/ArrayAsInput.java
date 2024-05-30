package CA226.ARRAYS;

import java.util.Scanner;

public class ArrayAsInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        //for loopss
//        System.out.println("Enter " + marks.length + " values:");
//        for(int i = 0; i < marks.length; i++) {
//            marks[i] = input.nextInt();
//        }
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10);
        }
        //printing array values
        int sum = 0;
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            sum += marks[i];
        }
        System.out.println("Total: " + sum);
        System.out.println("Avg: " + (sum / marks.length));
        //max marks
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];
        }
        //min marks
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min)
                min = marks[i];
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }
}
