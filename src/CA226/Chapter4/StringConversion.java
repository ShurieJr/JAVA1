package CA226.Chapter4;

public class StringConversion {
    public static void main(String[] args) {
        String id = "100";
        String amount = "38.888";

        int studentId= Integer.parseInt(id);
        double studentnumer = Double.parseDouble(amount);


        int grade = 100;
        String gradeAmount = String.valueOf(grade);
        String grade2 = grade + ""; //conversion
    }
}
