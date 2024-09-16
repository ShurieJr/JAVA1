package CA226;

public class Main {
    static int sum;    //global variable  // class level variable
    public static void main(String[] args) {
        //local variables
        int x ;
        System.out.println();
        System.out.println(sum);
        display();

        int array2[] = new int[90];
        array2[0] =23;
        array2[1] =230;
        array2[2] =2;
        System.out.println(array2.length);
    }





    //
    public static void display(){
        int x = 6;
        System.out.println(sum);
    }
}
