package CA2212.chapter7;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring , creating
//        int[] numbers;
//        numbers = new int[5];
        int[] numbers = new int[5];
       // int[] numbers = {10,20,30,40,50};  //shorthand
        //length of the array
        System.out.println("Length: " + numbers.length);
        //access to the array
        //numbers[4] = 20;
        //initialization of the array - input values
        System.out.println("Enter " + numbers.length + " values:");
//        for(int counter=0; counter < numbers.length; counter++){
//            numbers[counter] = input.nextInt();
//        }
                //initialization of the array - random values
        for(int counter=0; counter < numbers.length; counter++){
            numbers[counter] =(int) (Math.random() * 100);
        }

        //printing the array elements
        System.out.println("Array elements: ");
        int i = numbers.length-1;
        while(i >= 0){
            System.out.println(numbers[i]);
            i--;
        }

        }
}
