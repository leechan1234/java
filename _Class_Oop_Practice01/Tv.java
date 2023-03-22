package _Class_Oop_Practice01;

public class Tv {
    Boolean power;
    String color;
    int channel;
    int hour;

    String number;
    String pettern;
    static int width = 100;
    static int height =200;



    void power() {
        if (power) {
            power = false;
        } else {
            power = true;
        }
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}
