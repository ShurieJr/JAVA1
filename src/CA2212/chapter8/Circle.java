package CA2212.chapter8;

public class Circle {
    //data fields - variables
    double radius; //instance variable
    static int numberOfObjects; //static variable

    //constructors
    Circle(){ //no-arg constructor
       radius = 1.0;
       numberOfObjects++;
    }
    Circle(double newradius) {
        radius = newradius;
        numberOfObjects++;
    }
    //methods
    double getArea(){ //instance method
        return radius * radius * Math.PI;
    }
    //static method
 static int getNumberOfObjects(){
        return numberOfObjects;
    }

    //main method
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Circle obj2 = new Circle(2.5);
       obj1.radius = 100;
//        obj2.numberOfObjects = 40;
//        System.out.println(obj1.numberOfObjects);
//        System.out.println(obj2.numberOfObjects);
//        System.out.println(Circle.numberOfObjects);

    }
}
