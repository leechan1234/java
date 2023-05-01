package _01_Practice;

class TinCase{
    int width;
    int height;
    int length;
    String color;
    TinCase(int width , int height , int length , String color){
        this.width=width;
        this.height=height;
        this.length=length;
        this.color=color;
    }

    void allInsters(){
        System.out.println(width + "*" + height + "*" + length + "cm의" + color + "틴케이스 제작");
    }
}
public class TinCase_Main {
    public static void main(String[] args) {
        TinCase t = new TinCase(10,20,5,"빨강색");
        t.allInsters();
    }
}
