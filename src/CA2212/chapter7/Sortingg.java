package CA2212.chapter7;

import java.util.Arrays;

public class Sortingg {
    public static void main(String[] args) {
        int[] numbers = {1,10 , 5 ,20 , 3};
       // Arrays.sort(numbers);
        Arrays.parallelSort(numbers);

        System.out.println(Arrays.toString(numbers));  //print array elements
        System.out.println(numbers.toString());  //array address
    }
}
