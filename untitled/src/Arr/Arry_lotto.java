package Arr;

public class Arry_lotto {
    public static void main(String[] args) {

        //1~45 6자리 로또 번호 추첨기를 만드세요 (중복제거)
        int[] lotto = new int[6];
        int idx = 0;
        while (true){
            int number = (int)(Math.random()*45)+1;

            boolean insert = true;
            for (int i = 0; i <=idx ; i++) {
                if(lotto[i] == number){
                    insert = false;
                    break;
                }
            }
            if (insert == true){
                lotto[idx] = number;
                idx++;
            }
            if (idx == 6)break;
        }
        for (int i = 0; i < lotto.length ; i++) {
            System.out.println(lotto[i]);
        }

    }
}






