package _Class_Oop_Practice01;

public class Tv {
    //변수
    String color; // 색
    boolean power; // 전원상태
    int channel; //채널
    //기능
    void power(){
        power= ! power;
    }
    void  channelUp(){
        channel++;
    }
    void  channelDown(){
        channel--;
    }

}
