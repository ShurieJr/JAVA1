package CA226.Chapter4;

public class StringMethods {
    public static void main(String[] args) {
        String firstName = "Mohamed";
        String lastName = "Abdullahi";

        String message = "Welcome to java";

        //methods
        //chrarAt(index)
        System.out.println("CharAt(0) :" + message.charAt(0));
        //indexOf(char
        System.out.println("IndexOf('a') :" + message.indexOf('a'));

        //replace
        System.out.println("Replace:" +
                message.replace("java" , "Python"));
        //subString
        System.out.println("substring(11) : " + message.substring(11));
        System.out.println("substring(8 , 11) : " + message.substring(8 ,11));

        //startsWith
        System.out.println("startsWith(W): " + message.startsWith("W"));
        //EndsWith
        System.out.println("EndsWith(W): " + message.endsWith("W"));

        //lastIndexof
        System.out.println("lastIndexof(a): " + message.lastIndexOf("a"));

        //tolowercase
        System.out.println("tolowercase(): " + message.toLowerCase());
        //to upper case
        System.out.println("to upper case(): " + message.toUpperCase());

        //trim
        System.out.println("trim(): " + firstName.trim() + lastName);

        //equals
        System.out.println("equals(): " + "abc".equals("Abc"));
        //equlasIgnoreCase
        System.out.println("equalsIgnorecase(): " + "abc".equalsIgnoreCase("ABC"));
        //compareto
        System.out.println("compareto(): " + "A".compareTo("a"));  //-32
        //comparetoIgnoreCase
        System.out.println("comparetoIgnorecase(): " + "A".compareToIgnoreCase("a")); //0


    }
}
