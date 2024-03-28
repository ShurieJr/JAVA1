package CA226.Chapter4;

public class EscapeSequenceChars {
    public static void main(String[] args) {
        String firstName = "Ali";
        String secondName = "Abdullahi";

        // \"
        System.out.println("welcome to \"java\"  ");

        //  \n
        System.out.println(firstName + "\n" + secondName);

        //  \t
        System.out.println(firstName + "\t" + secondName);

        //  \\
        System.out.println(firstName + "\\" + secondName);

        //  \b
        System.out.println(firstName + " k\b" + secondName);

//        // \f
//
//        System.out.println("Jamhuriya \f University " );
//        //  \r
//        System.out.println("Jamhuriya \r University " );
    }
}
