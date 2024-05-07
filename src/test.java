public class test {
    public static void main(String[] args) {
        double item = 1; double sum = 0;
        while (item != 0) { // No guarantee item will be 0
            sum += item;
            System.out.println("item: " + item);
            item -= 0.1;
        }
        System.out.println(sum);

    }
}
