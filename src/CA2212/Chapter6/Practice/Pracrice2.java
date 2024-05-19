package CA2212.Chapter6.Practice;

public class Pracrice2 {
    public static void main(String[] args) {

        String name = "Welcome to jamhuriya";
        System.out.println(getNoOfVowels(name));
    }

    //method
    public static int getNoOfVowels(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            String character = String.valueOf(text.charAt(i));
            if (character.equals("A") || character.equals("a") ||
                    character.equals("E") || character.equals("e") ||
                    character.equals("I") || character.equals("i") ||
                    character.equals("O") || character.equals("o") ||
                    character.equals("U") || character.equals("u")){
                counter++;
            }
        }
        return counter;
    }
}
