package switch_Test;

import java.util.Scanner;

public class Switch_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("점수를 입력 하세요");
        int user = scanner.nextInt();
        String grade ="";

        switch (user /10){
            case 9 :
                grade = "A";
                break;
            case 8 :
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
            case 6 :
                grade = "D";
                break;
                default:
                grade = "F";
                break;
        }
        System.out.println("당신의 학점은" + grade);
    }
}
