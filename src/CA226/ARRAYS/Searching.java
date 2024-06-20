package CA226.ARRAYS;

public class Searching {
    public static void main(String[] args) {
        int[] numbers = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
        int key = 90;
//method call
        System.out.println(search(numbers , key));

    }
    static boolean search(int[] numbers , int key){
        for(int i = 0; i < numbers.length; i++)
            if(key == numbers[i])
                return true;
            return false;

    }
}
