package CA226.chapter5;

import java.util.Scanner;

public class isplindrome {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = input.next();

        int low =0, high = name.length()-1;
        boolean isPlindrome = true;

        while(low < high){
            if(name.charAt(low) != name.charAt(high)){
                isPlindrome = false;
                break;
            }
            low++;
            high--;
        }

        System.out.println("isPlindrome: " + isPlindrome);


    }
}
