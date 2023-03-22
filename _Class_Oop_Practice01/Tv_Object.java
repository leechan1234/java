package _Class_Oop_Practice01;

public class Tv_Object {
    public static void main(String[] args) {
        Tv t = new Tv();
        Tv t2 = new Tv(); // 객채
        Tv t3 = new Tv();
        t3.color ="블랙";
        System.out.println(t3);
        t.color = "검정";
        System.out.println(t.color);
        System.out.println("현재 t의 channel 값은"+ t.channel+"입니다");
        System.out.println("현재 t2의 channel 값은"+ t2.channel+"입니다");
        t = t2;
        t2.channel = 7;
        System.out.println("현재 t의 channel 값은"+ t.channel+"입니다");
        System.out.println("현재 t2의 channel 값은"+ t2.channel+"입니다");

        System.out.println("-----------------------------");
        // 객체 배열 생성 방법
        Tv[] Array =new Tv[3];
        Array[0] = new Tv();
        Array[1] = new Tv();
        Array[2] = new Tv();
        Tv[] Array2 ={new Tv(), new Tv(), new Tv() };
        Tv[] Array3 = new Tv[100];
        for (int i = 0; i <Array3.length ; i++) {
            Array3[i] = new Tv();
        }
        System.out.println("-------------------------------");
        Tv[] tvArr = new Tv[3]; // 이것은 단순 객체 배열을 다루기 위한 참조변수들이 만들어진거 뿐이다
        tvArr[0]= new Tv(); //객체 배열만 생성해 놓으면 안되고 이와같이 객체를 생성해야함
        tvArr[1] =new Tv();
        tvArr[2]= new Tv();
        //위에 있는것을 간단히
        Tv[] TvArr2 =new Tv[100];
        for (int i = 0; i <TvArr2.length ; i++) {
            TvArr2[i]=new Tv();
        }
        int hour;
        int minute;
        int second;
        Tv b2 = new Tv();
        System.out.println("-----------------");
        Tv b5 = new Tv();
        Tv.width= 200;
        Tv.height =150;




    }
}
