package CA2212.chapter4;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        //Math class methods
        //Constant
        //System.out.println(Math.PI);

        //Trignometric
        System.out.println("Sin (0) : " + Math.sin(0));
        System.out.println("cos (0) : " + Math.cos(0));

        //exponent
        System.out.println("pow(3,2): "+ Math.pow(3 , 2));
        System.out.println("sqrt(16): "+ Math.sqrt(16));
        System.out.println("log(2): "+ Math.log10(2));
        System.out.println("exp(2): "+ Math.exp(2));

//        System.out.println( (Math.E) * (Math.E) );

        //min , max and abs
        System.out.println("max(10 , 100) : " + Math.max(10 ,100));
        System.out.println("min(10 , 100) : " + Math.min(10 ,100));

        System.out.println("abs(-10): " + Math.abs(-10));

        //rounding
        System.out.println("ceil(2.1): " + Math.ceil(2.1));
        System.out.println("floor(2.1): " + Math.floor(2.1));
        System.out.println("round(2.6): " + Math.round(2.6));
        System.out.println("round(2.6f): " + Math.round(2.6f));

        //random number
        System.out.println("random():" + Math.random());
        System.out.println("random() 50:" + (int)(40 +  Math.random()*51));


        //random character
        char randomChar =(char) ('a' + Math.random() *  ('z' - 'a' + 1));
        char randomCharUppercase =(char) ('A' + Math.random() *  ('Z' - 'A' + 1));
        char numericChar =(char) ('0' + Math.random() *  ('9' - '0' + 1));

        System.out.println(numericChar);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character:");
        char ch = scanner.next().charAt(0);

        System.out.println("isdigit(): " + Character.isDigit(ch));
        System.out.println("isletter(): " + Character.isLetter(ch));
        System.out.println("isletterorDigit(): " + Character.isLetterOrDigit(ch));
        System.out.println("islowercse(): " + Character.isLowerCase(ch));
        System.out.println("isuppercase(): " + Character.isUpperCase(ch));
        System.out.println("toLowercase(): " + Character.toLowerCase(ch));
        System.out.println("toUppercase(): " + Character.toUpperCase(ch));

//        if(character >= 'A' && character <= 'Z')
//            System.out.println("Uppercase letter");
//        else if(character >= 'a' && character <= 'z')
//            System.out.println("lowercase letter");
//        else if(character >= '0' && character <= '9')
//            System.out.println("numeric character!");


    }
}
