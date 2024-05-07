package CA2212.cHPATER_5_loops;

public class doWhileLoop {
    public static void main(String[] args) {
        int number = 5;
        int n = 1;
        //loop
        do{
            //body
            System.out.println(number);
            //update
            number--;
        }while(number >= n);   //post-test loop
    }
}
