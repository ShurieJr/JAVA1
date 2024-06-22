package CA2212.chapter8.P1;

public class Class2 {

    public static void main(String[] args) {
        Class1 obj = new Class1();

        obj.x =20; //public
        obj.y = 30; //default
        obj.setZ(40);
        System.out.println(obj.getZ());

    }

}
