package if_Test;

public class _03_If {
    public static void main(String[] args) {
        int score =80;
        String grade= "";

        System.out.println("학점여부 시작");
        if (score >=95){
            grade = "A+";
        } else if (score >= 90) {
            grade = "A";
        }
    }
}
