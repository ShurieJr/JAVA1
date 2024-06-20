package CA226.ARRAYS;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
        String[] names = {"ali", "omar"};
        int total = 0;
        for(int item : numbers) {
            System.out.println(item);
            total += item;
        }
        System.out.println("Total: " + total);
        for(String name : names) {
            System.out.println(name);
        }
    }
}
