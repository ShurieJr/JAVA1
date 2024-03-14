package CA226.selections;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter day ");
        int day = scanner.nextInt();

        //switch
        switch (day) {
            case 1:
                System.out.println("Sabti");
                break;
            case 2:
                System.out.println("axad");
                break;
            case 3:
                System.out.println("isniin");
                break;
            case 4:
                System.out.println("talaado");
                break;
            case 5:
                System.out.println("arbaco");
                break;
            case 6:
                System.out.println("khamiis");
                break;
            case 7:
                System.out.println("jimco");
                break;
            default:
                System.out.println("maalintaan majirto!");
        }

        //switch weekday , weekend
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("maalmaha shaqada!");
                break;
            case 6:
            case 7:
                System.out.println("maalmaha fasaxa!");
                break;
            default:
                System.out.println("invalid day!");

        }
    }
}
