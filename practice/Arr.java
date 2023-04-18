package practice;

public class Arr {
    public static void main(String[] args) {
        //1.문제. 최대값,최소값 구하기
        int[] score = {79,45,67,34,98,51};
        int max = score[0];
        int min = score[0];
        for (int i = 0; i <score.length ; i++) {
            if (score[i] > max){
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
