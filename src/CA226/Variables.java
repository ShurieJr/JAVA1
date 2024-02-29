package CA226;
import java.util.*;  //implicit import -- all classes
public class Variables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        int age ;
        double salary;
        float bonus;
        long savingBalance;
        byte rate = 127;
        short out  = 32000;

        //initialize variables
        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your salary: ");
        salary = input.nextDouble();

        System.out.println("Enter your bonus: ");
        bonus = input.nextFloat();

        System.out.println("Enter your savingBalance: ");
        savingBalance = input.nextLong();

        //display variables
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("SavingBalance = " + savingBalance);

    }
}
