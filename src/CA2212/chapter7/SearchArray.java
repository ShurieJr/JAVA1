package CA2212.chapter7;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//searching
        int[] list = {1,2,7,4,5,5,6,7,7};

        System.out.println("Enter key:");
        int key = input.nextInt();
        //calling
        int index = linearSearch(key, list);
        System.out.println("Index:" + index);

    }
//linear search method
    public static int linearSearch(int key,int[] array){
        for(int i = 0; i < array.length; i++)
            if(key == array[i])
              return i;
            return -1;
    }
}
