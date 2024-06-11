package CA2212.chapter8;

public class Circle {
    //data fields - variables
    double radius;
    //constructors
    Circle(){ //no-arg constructor
       radius = 1.0;
    }
    Circle(double newradius) {
        radius = newradius;
    }
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
}
