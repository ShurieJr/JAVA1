package CA226.chapter5;

public class ContinueDemo {
    public static void main(String[] args) {
        //output  0 1 2 -  4 5 6 - - 9 10
        for (int i = 0; i <=10; i++) {
            if(i == 7 || i == 8 || i == 3)
                continue;
            System.out.println(i);
        }
    }
}
