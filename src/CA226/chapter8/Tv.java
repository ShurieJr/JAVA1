package CA226.chapter8;

public class Tv {
    //variables
    int channel;
    int volumeLevel;
    boolean on;

    //constructors
    Tv() {
    channel = 1;
    volumeLevel = 0;
    on = false;
    }
    //methods
    void turnOn(){
        if(on == false)
            on = true;
        else
            System.out.println("already turned on!");
    }
    void turnOff(){
        if(on == true)
        on = false;
        else
            System.out.println("already turned off!");
    }
    void setChannel(int newChannel){
        if(newChannel >=1 && newChannel <= 120)
            channel = newChannel;
        else
            System.out.println("invalid channel");
    }
    void setVolumeLevel(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
    void channelUp(){
        if(channel < 120)
           channel++;
        else
            System.out.println("invalid channel");
    }
    void channelDown(){
        if(channel > 1)
            channel--;
        else
            System.out.println("invalid channel");
    }
    void volumeDown(){
        volumeLevel--;
    }
    void volumeUp(){
        volumeLevel++;
    }
    //main method
    public static void main(String[] args) {
     Tv asal = new Tv();
     asal.turnOn();
     asal.setChannel(120);
     asal.channelUp();
        System.out.println(asal.channel);
    }
}
