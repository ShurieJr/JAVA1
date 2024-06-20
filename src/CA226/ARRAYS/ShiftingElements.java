package CA226.ARRAYS;

public class ShiftingElements {
    public static void main(String[] args) {
        int[] numbers = {2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};

        //shifting elements
        int temp = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            numbers[i - 1] = numbers[i];
        }
        numbers[numbers.length - 1] = temp;
        //printing elements
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
