package _01_Class;

import src.TypeCasting;

public class TvTest {
    public static void main(String[] args) {
//        Tv t1 = new Tv();
//        Tv t2 = new Tv();
//        System.out.println("t1의 체널 값은" + t1.channel + "입니다");
//        System.out.println("t2의 체널 값은" + t2.channel + "입니다.");
//
//        t1.channel = 7;
//        System.out.println("t1의 체널 값을 7로 변경 하였습니다");
//        t1.channelDown();
//        System.out.println("t1의 채널 값은" + t1.channel + "입니다");
//        System.out.println("t2의 채널 값은" + t2.channel + "입니다");

        Tv[] tvArr = new Tv[3];
        //tv 객체를 생성해서 tv객체 배열의 각 요소에 저장
        for (int i = 0; i <tvArr.length ; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10을 저장
        }
        for (int i = 0; i <tvArr.length ; i++) {
            tvArr[i].channelUp(); //tvArr[i]의 메서드를 호출. 채널이 1증가
            System.out.println(tvArr[i].channel);
        }



        }


    }

