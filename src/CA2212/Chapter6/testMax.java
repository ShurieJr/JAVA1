package CA2212.Chapter6;

public class testMax {
    public static void main(String[] args) {
        //calling
        power(2.0 , 3.0);
        System.out.println(power(2 , 3));

        int age = 30;
        String name = "Ali omar";
        //System.out.println(STR."Name : \{name} \nAge: \{age}");
    }
//Method overloading
    //void method
    public static void power(double x, double y) {
        System.out.println(Math.pow(x, y));
    }
    //value return method
    public static int power(int x, int y) {
        return (int) Math.pow(x, y);
    }
}
