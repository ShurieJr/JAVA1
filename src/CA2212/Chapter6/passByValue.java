package CA2212.Chapter6;

public class passByValue {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(increment(x));
    }

    //increment method
    public static int increment(int num ) {
        return ++num;
    }



    //swap
    static void swap(int num1 , int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
