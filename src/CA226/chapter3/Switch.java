package CA226.chapter3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter day as number
        System.out.println("Enter day as number: ");
        int day = input.nextInt();

        //switch
        switch (day) {
            case 1:
                System.out.println("Sabti");
                break;
            case 2:
                System.out.println("Axad");
                break;
            case 3:
                System.out.println("Isniin");
                break;
            case 4:
                System.out.println("Talaado");
                break;
            case 5:
                System.out.println("Arbaco");
                break;
            case 6:
                System.out.println("Khamiis");
                break;
            case 7:
                System.out.println("Jimico");
                break;
            default:
                System.out.println("Unknown day");
        }

        //2. switch
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Maalmaha usbuuca");
                break;
            case 6:
            case 7:
                System.out.println("Maalmaha fasaxa");
                break;
            default:
                System.out.println("majirto maalintaan");
        }
    }
}
