package CA226.chapter8;

public class Main {
    public static void main(String[] args) {
        //create an object
        // classname objrefvaraibale = new Classname();
//        Circle myCircle = new Circle();   //1.0
//        Circle yourCircle = new Circle(2);  //2
//        Circle Circle3 = new Circle(20);

//        //myCircle.radius = 50;
////        System.out.println("mycircle : " + myCircle.radius);
////        System.out.println("yourcircle : " + yourCircle.radius);
////
////        System.out.println("myCircle area : " + myCircle.getArea());
////        System.out.println("yourCircle area : " + yourCircle.getArea());
//        myCircle.numberOfObjects = 20;
//        yourCircle.numberOfObjects = 30;
//        System.out.println("number objects: " + Circle.numberOfObjects);
//        System.out.println("number objects (mycircle): " + myCircle.numberOfObjects);
//        System.out.println("number objects (yourcircle): " + yourCircle.numberOfObjects);
///TV class-----------
        Tv astaan = new Tv();

        astaan.turnOn();
        astaan.setChannel(100);
        astaan.setVolumeLevel(15);
        astaan.volumeUp();
        astaan.turnOn();
        System.out.println("channel:" + astaan.channel);
        System.out.println("volume:" + astaan.volumeLevel);
        System.out.println("on:" + astaan.on);
    }
}
