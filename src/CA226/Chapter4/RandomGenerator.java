package CA226.Chapter4;

public class RandomGenerator {
    public static void main(String[] args) {
        System.out.println("RANDOM NUMBER");
        System.out.println("Math.random() : "
                + Math.random()); //default value between 0.0 and 1.0
        System.out.println("Math.random() * 70 : " + (int) (Math.random() * 70));
        //value between 0.0 and 70
        System.out.println("50 + math.random() * 50 : "
                + (int) (50 + Math.random() * 50));

        //random characters
        char randomChar = (char) ('a' + Math.random() * ('z' - ('a' + 1)));
        char randomCharCapital = (char) ('A' + Math.random() * ('Z' - ('A' + 1)));
        System.out.println("randomchar: " + randomChar);
        System.out.println("randomcharcAPITAL: " + randomCharCapital);

        //CHECKING

        char ch = 'A';
//        if('a' <= ch && 'z' >= ch)
//            System.out.println("lowercase character!");
//        if('A' <= ch && 'Z' >= ch)
//            System.out.println("Uppercase character!");
//        if('0' <= ch && '9' >= ch)
//            System.out.println("numeric character!");


        //charcater methods
        System.out.println(Character.isLetter(ch));  //true
        System.out.println(Character.isDigit(ch)); //false
        System.out.println(Character.isLetterOrDigit(ch)); //true
        System.out.println(Character.isLowerCase(ch)); //false
        System.out.println(Character.isUpperCase(ch)); //true

        System.out.println(Character.toLowerCase(ch)); //a
        System.out.println(Character.toUpperCase(ch)); //A
    }
}
