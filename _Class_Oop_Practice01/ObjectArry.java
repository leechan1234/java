package _Class_Oop_Practice01;

public class ObjectArry {
    public static void main(String[] args) {
        Tv[] arr = new Tv[20]; //길이가 10인 tv객체 배열을  10-30 채널 만들기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Tv();
            arr[i].channel = i + 10;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].channelUp();
            System.out.println(arr[i].channel);
        }


    }
}

