package MachineClass;

import _Review_Method._return;

public class VendingMachine {
    //field
    //생성자
    //method

    public String pushProductButton(int menewId) {
        System.out.println(menewId + "를 받았습니다");
        return "콜라";
    }

    public static void printversion(){
        System.out.println("v1.0");
    }

    public static int abs( int x){
        if (x < 0){
            return x * -1;
        }else
            return x;
    }

    public static int add(){
        return 0;
    }

}
