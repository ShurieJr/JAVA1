package CA2212.cHPATER_5_loops;

import java.util.Scanner;

public class CheckingPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string :" );
        String name = input.next();

        //index
        int low = 0;
        int high = name.length()-1;

        boolean isPlindrome =true;
        while (low < high) {
            if(name.charAt(low) != name.charAt(high)) {
                isPlindrome = false;
                break;
            }
            low++;
            high--;
        }
        //display results
        if(isPlindrome) {
            System.out.println(name + " is plindrome");
        }
        else
            System.out.println(name + " is not plindrome");
    }
}
