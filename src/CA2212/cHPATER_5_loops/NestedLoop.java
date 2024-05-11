package CA2212.cHPATER_5_loops;

public class NestedLoop {
    public static void main(String[] args) {
        //multplication table
        //Nested Loops

        for (int i = 1; i <= 12; i++) { //outer loop
            for (int j = 1; j <= 10; j++) {//inner loop
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("=============================");
        }
    }
}
