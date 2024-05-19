package CA2212.Chapter6.Practice;

public class Practice {
    public static void main(String[] args) {
        String text = "Welcome to java";
        //method calling - invoke the method
        String subText = SubString(text , 11 , 15);
       // System.out.println(subText);
        int randomNumber = (int) (Math.random() * 70);
        System.out.println(randomNumber);

    }
    public static String SubString(String text , int start, int end) {
        String result = "";
        for (int index = start; index < end; index++) {
            result += text.charAt(index);
        }
        return result;
    }
}
