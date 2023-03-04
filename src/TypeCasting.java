package src;

public class TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); //93.0
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_b = 98.8;
        System.out.println((int)score_b);
        System.out.println((int)score_f);

        // 정수 + 실수 연산
         score = 93 +(int) 98.8;
        System.out.println(score);

        score_b = (double) 93+ 98.8;
        System.out.println(score_b);

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191.8 -> 191
        // int- long -float -double (자동 형변환)
        int convertedScoreInt =(int) score_b;
        // double -> float -> long -> int (수동 형변환)

        //숫자를 문자열로
         String s1 = String.valueOf(93);
          s1= Integer.toString(93);
        System.out.println(s1);
         //실수를 문자열로
          String s2= String.valueOf(98.8);
           s2= Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);
    }
}
