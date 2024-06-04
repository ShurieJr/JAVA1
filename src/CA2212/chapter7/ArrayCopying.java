package CA2212.chapter7;

public class ArrayCopying {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = new int[array1.length];

//        for(int i = 0; i < array1.length; i++){
//            array2[i] = array1[i];
//        }
        System.arraycopy(array1, 0,
                array2, 0, array1.length);

        for(int value : array2) {
            System.out.println(value);
        }

        System.out.println(array1.toString());
        System.out.println(array2.toString());
    }
}
