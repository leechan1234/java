package Arr;

public class Arr_Test_01 {
    public static void main(String[] args) {
        //선언
        int[] arr ;
        int[] arrInt = {1,2};

        System.out.println(arrInt[0]);

        //선언2
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;// 길이가 5개인 객체 값은 0
        System.out.println(a[2]);
    }
}
