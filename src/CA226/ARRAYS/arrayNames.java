package CA226.ARRAYS;

public class arrayNames {
    public static void main(String[] args) {
     String[] names = new String[4];
     boolean[] status = {true, false};

     names[0] = "Ali";
     names[1] = "Abdullahi";
     names[2] = "Omar";

     String fullName = names[0] + " " +
             names[1] + " " +  names[2];
        System.out.println(fullName);

    }
}
