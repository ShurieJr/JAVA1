package CA226.chapter5;

public class BreakDemo {
    public static void main(String[] args) {
        //output  0 1 2 3  4 5
        for (int i = 0; i <=10; i++) {
            if(i > 5)
                break;
            System.out.println(i);
        }


    }
}
