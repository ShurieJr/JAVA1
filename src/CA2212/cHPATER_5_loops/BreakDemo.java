package CA2212.cHPATER_5_loops;

public class BreakDemo {
    public static void main(String[] args) {
        //output : 0 1 2 3 4 5
        for (int i = 0; i <=10; i++){
            if(i == 6) break;  //exit or terminate

            System.out.println(i);
        }
    }
}
