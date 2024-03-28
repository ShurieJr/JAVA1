package CA226.Chapter4;

public class FormattingString {
    public static void main(String[] args) {
        int id = 100;  // %d
        double marks = 95.4544;   // %f
        String name = "Mohamed geedi";   // %s
        boolean status = true;     // %b
        char GPA = 'A';    // %c
        System.out.printf("student id: %d , \nname: %s , \nmarks: %.2f , \nGPA: %c ," +
                " \nstatus: %b " , id ,name , marks , GPA, status );

        String university = "JUST";
        System.out.printf("university name : %s" , "JUST");
    }
}
