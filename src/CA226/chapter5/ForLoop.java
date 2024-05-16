package CA226.chapter5;

public class ForLoop {
    ////   static int i;   // global field
//   static String name;
//   static boolean enabled;
    public static void main(String[] args) {
        //for loop - 0 1 2 3 4 5 6
        int i = 0;//declaration
//        for (; i <= 6; i++) {
//            System.out.println(i);
//        }
        while (i <= 6) {
            System.out.println(i);
            i++;
        }
        do{
            System.out.println(i);
            i++;
        }while (i <= 6);

//        System.out.println("\n-------------------------");
//        //output : 0 2 4 6 8 10
//        for ( i = 0; i <= 10 ; i= i + 2){
//            System.out.println(i);
//        }
//        System.out.println("\n-------------------------");
//        //
//        for ( i = 0; i <=5; System.out.println(i++));
//        System.out.println("\n-------------------------");
//        //
//        for(int j = 0, k = 0;  (j + k) <= 10;  j++,k++){
//            System.out.println(j + k);
//        }

    }
}
