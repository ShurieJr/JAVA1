package CA226.ARRAYS;

public class Copying {
    public static void main(String[] args) {
        int[] sourceArray = {1 , 2 , 3 , 4};
        int[] targetArray = new int[sourceArray.length];

        //1. Assignment operator
//        targetArray = sourceArray;
        //2. for loop
//        for(int i = 0; i < sourceArray.length; i++){
//            targetArray[i] = sourceArray[i];
//        }
        //3. ArrayCopy method
        System.arraycopy(sourceArray,0, targetArray , 0, sourceArray.length);
        //print array elem
        targetArray[0] = 10;
        System.out.println("Source Array: " );
        for(int value : sourceArray) {
            System.out.println(value);
        }
        System.out.println("Target Array: " );
        for(int value : targetArray) {
            System.out.println(value);
        }
    }
}
