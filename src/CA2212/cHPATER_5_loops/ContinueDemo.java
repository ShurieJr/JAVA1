package CA2212.cHPATER_5_loops;

public class ContinueDemo {
    public static void main(String[] args) {
        //output : 0 1 2 3 4  8 9 10
        for (int i = 0; i <=10; i++){
            if(i == 5 || i == 6 || i== 7)
                continue;  //exit current iteration

            System.out.println(i);
        }
        System.out.println("------------------------------");
        //while loop
        int i = 0;
        while(i <=10){
            if(i == 5 || i == 6 || i== 7){
                i++;
                continue;  //exit current iteration
                 }
            System.out.println(i);
            i++;
        }
    }
}
