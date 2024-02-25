package CA2212;

public class TypeCasting {
    public static void main(String[] args) {
        double grade = 70;  // type widening

        System.out.println(grade);

        int total = 0;
        total +=  5.2 + 3;  //type narrowing
        System.out.println(total);
        

        int sum = 0;
        
        sum += 3;

        int num1 = 1;
        int num2 = 2;

        double average = (num1 + num2) / 2.0;
        System.out.println("average: " + average);
    }
}
