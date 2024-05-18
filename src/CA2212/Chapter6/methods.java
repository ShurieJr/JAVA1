package CA2212.Chapter6;

public class methods {

    public static void main(String[] args) {
     //calling
      test();
      int a = 20;
      int b = 4;
       int maximum =  max(a , b);
       int minimum = min(a, b );
        System.out.println("maximum " + a + " & " + b + " : " +  maximum);
        System.out.println("minimum " + a + " & " + b + " : " +  minimum);
    }
    //method definition
   public static void test(){
        System.out.println("test method");
    }
    public static int max(int num1, int num2){
        if(num1 > num2)
           return num1;
        else
            return num2;
    }
    public static int min(int num1, int num2){
        int result;
        if(num1 < num2)
            result = num1;
        else
            result = num2;
        return result;  //return keyword
    }

}
