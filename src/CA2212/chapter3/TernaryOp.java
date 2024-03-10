package CA2212.chapter3;

public class TernaryOp {
    public static void main(String[] args) {
        int age = 10;

//        if (age > 15)
//            System.out.println("Adult");
//        else
//            System.out.println("child");
        //Ternary operator
        System.out.println(
                (age > 15) ? "Adult" : "Child"
        );


        int number1 = 1, number2 = 2;
        double average = (number1 + number2) / 2.0;

        System.out.println(average);
    }
}
