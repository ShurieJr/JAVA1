package CA226.Chapter4;

public class MathClass {
    public static void main(String[] args) {
        //constant variables
        System.out.println("PI : "  + Math.PI);
        System.out.println("E : "  + Math.E);

        //Trignometric methods
        System.out.println("sin(0): " + Math.sin(0));
        System.out.println("cos(0): " + Math.cos(0));
        System.out.println("tan(0): " + Math.tan(0));

        //Exponent methods
        System.out.println("power(5 , 2) : " + Math.pow(5 , 2));
        System.out.println("sqrt(25): " + Math.sqrt(25));
        System.out.println("exp(1): " + Math.exp(1));
        System.out.println("log10(2): " + Math.log10(2));

        //Min , max , abs
        System.out.println("min(10 , 20) : " + Math.min(10 ,20));
        System.out.println("max(10 , 20) : " + Math.max(10 ,20));
        System.out.println("abs(-3.1): " + Math.abs(-3.1));

        //rounding methods
        System.out.println("ceil(10.5) : " + Math.ceil(10.5)); //round up
        System.out.println("ceil(-10.5) : " + Math.ceil(-10.5)); //round up

        System.out.println("floor(10.5) : " + Math.floor(10.5)); //round down
        System.out.println("floor(-10.5) : " + Math.floor(-10.5)); //round down

        System.out.println("round(10.5) : " + Math.round(10.5));
        System.out.println("round(-10.5) : " + Math.round(-10.5));

        System.out.println("rint(2.1) : " + Math.rint(2.1));
        System.out.println("rint(2.5) : " + Math.rint(2.5));
        System.out.println("rint(2.6) : " + Math.rint(2.6));


    }
}
