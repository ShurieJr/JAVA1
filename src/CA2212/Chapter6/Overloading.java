package CA2212.Chapter6;

public class Overloading {
    public static void main(String[] args) {
        display();
        display(6);
        display("welomce");
        display("java", 10);
    }
    //method display
    public static void display(){
        System.out.println("Welcome to java!");
    }
    public static void display(String message){
        System.out.println(message);
    }
    public static void display(int number){
        System.out.println(number);
    }
    public static void display(String message , int n){
        for(int i=0; i<n; i++){
            System.out.println(message);
        }

    }
}
