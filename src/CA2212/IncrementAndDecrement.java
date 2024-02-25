package CA2212;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int total = 10;
        // Increment
        //1. preincrement
        System.out.println( ++total );  // 11
        //2.postincrement
        System.out.println( total++ );  //11

        System.out.println(total);  //12
        //decrement
        //1.pre-decrement
        System.out.println( --total ); //11
        //2.post-decrement
        System.out.println( total-- ); // 11

        System.out.println(total); //10

        //augmented assignment operator
        int marks = 70 ;
        marks += 20;   // marks = marks + 20;

        System.out.println("marks = " + marks);
    }
}
