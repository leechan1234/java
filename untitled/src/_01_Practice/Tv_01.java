package _01_Practice;

class Tv{
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channalUp(){
        ++channel;
    }
    void channalDown(){
        --channel;
    }
}
public class Tv_01 {
    public static void main(String[] args) {
        //길이가 3인 객체배열 선언
        Tv[] t = new Tv[3];
        for (int i = 0; i <t.length ; i++) {
             t[i] = new Tv();
             t[i].channel = i + 10; //tvArr[i]의 channel에 저장
        }

        for (int i = 0; i <t.length ; i++) {
            t[i].channalUp();
            System.out.printf("t[%d].channel=%d%n",i,t[i].channel);
        }





    }
}
