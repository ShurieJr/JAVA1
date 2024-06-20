package CA226.chapter8;

public class Circle {
    //class members
    //variables
    double radius;
    static int numberOfObjects;
    //constructors
    Circle(){
        radius = 1.0;
        numberOfObjects++;
    }
    Circle(double newradius) {
        radius = newradius;
        numberOfObjects++;
    }
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
}
