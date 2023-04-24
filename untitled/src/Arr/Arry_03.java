package Arr;

public class Arry_03 {
    public static void main(String[] args) {

//        int[][] arrInt = new int[3][];
//
//        arrInt[0] = new int[] {1};
//        arrInt[1] = new int[] {2,3};
//        arrInt[2] = new int[] {4,5,6};
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[1];

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }

        }
    }
}
