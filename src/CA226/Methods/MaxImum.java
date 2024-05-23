package CA226.Methods;

public class MaxImum {
    public static void main(String[] args) {
//method call
        int a= 20, b= 30;
//      int k =   max(a, b);
        //System.out.println( max(a, b));
        //System.out.println((max(a, b) + 40));  //calculation
      max2(a, b);
      max2(50, 79);
      max2(500, 600);
    }

    //max    -- value return
    public static int max(int num1, int num2) {
        if (num1 > num2)
           return num1;
        else
            return num2;
    }
    //max -- void
    public static void max2(int num1, int num2){
        if(num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
}
