package CA226.ARRAYS;

public class demo1 {
    public static void main(String[] args) {
//        int[] numbers;
//        numbers = new int[4];

        int[] numbers= new int[5];

        System.out.println("Length: " + numbers.length);

        // for loop
        for(int counter=1; counter < numbers.length; counter++) {
            numbers[counter] = counter + numbers[counter -1 ];
        }
        numbers[0]= numbers[1 ] + numbers[4];

        //print array elements
        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
