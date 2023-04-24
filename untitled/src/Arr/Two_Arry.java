package Arr;

public class Two_Arry {
    public static void main(String[] args) {
//        int[][] arry = new int[3][3];
//        arry[0][0] = 1;
//        arry[0][1] = 2;
//        arry[0][2] = 3;
//        arry[1][0] = 4;
//        arry[1][1] = 5;
//        arry[1][2] = 6;
//        arry[2][0] = 7;
//        arry[2][1] = 8;
//        arry[2][2] = 9;
//        for (int i = 0; i < arry.length ; i++) {
//            for (int j = 0; j < arry[i].length ; j++) {
//                System.out.print(arry[i][j]);
//            }
//            System.out.println();
//        }
//int[][] arry2 = {{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i < arry2.length ; i++) {
//            for (int j = 0; j <arry2[i].length ; j++) {
//                System.out.print(arry2[i][j]);
//            }
//            Syste

        int[][][] arry = new int[3][3][3];
        int value = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    arry[i][j][k] = value++;
                }
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    System.out.print(arry[i][j][k] + "\t");

                }
                System.out.println();
            }
        }
    }
}
