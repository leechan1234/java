package _01_Class;

public class Tv {
    //tv의속성
    String color;
    boolean power;
    int channel;

    //tv의 기능(메서드)
    void power(){
        power =!power;
    }
     void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
