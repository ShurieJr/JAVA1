import CA226.TTTTTTTTTT;

import java.util.Scanner;

public class test extends TTTTTTTTTT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddSum = 0;
        int countOdd = 0;
        int countEven = 0;
        int evenSum = 0;
        int count = 0;
        int number;
        System.out.println("Meeqo Number aa soo galin rabtaa:");
        int n = input.nextInt();
       do {
            System.out.println("Enter number " + (count+1));
            number = input.nextInt();
           if(number % 2 == 0){
               oddSum += number;
           countOdd++;
           }
           else{
               evenSum += number;
           countEven++;
           }
            count++;
        } while (count < n);
        System.out.println("total of even numbers: " + evenSum);
        System.out.println("Average of even numbers: " + (evenSum / countEven));
        System.out.println("total of odd numbers: " + oddSum);
        System.out.println("Average of odd numbers: " + (oddSum / countOdd));


    }
    public  void display(){
        System.out.println("test");
    }
    }

