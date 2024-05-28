public class check {
    public static void main(String[] args) {
        String s1 = "bank", s2 = "bnak";
        System.out.println(check(s1, s2));
    }

    public static boolean check(String s1, String s2) {
        boolean status = false;
        int length = s1.length();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < length; i++) {
                status = false;
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        status = true;
                        String temp = String.valueOf(s2.charAt(j));
                      s2= s2.replace(temp, "");
                    }
                }
                if(status == false) {
                    break;
                }
            }
        }
        return status;
    }
}
