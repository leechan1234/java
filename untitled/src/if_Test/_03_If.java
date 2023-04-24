package if_Test;

public class _03_If {
    public static void main(String[] args) {
      int score = 80;
      String grade ="";

        System.out.println("학점 여부 시작");
         if (score >= 95){
             grade ="A+";
         } else if (score >=85) {
             grade = "B+";
         } else if (score >=80) {
             grade = "B";
         } else if (score >=70) {
             grade = "C ";
         } else if (score >=60) {
             grade = "D";
         }else {
             grade ="F";
         }
        System.out.println("당신의 학점은" + score + "점으로 " + grade + "입니다");
    }
}
