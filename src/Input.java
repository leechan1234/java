package src;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
       try {
           int intValue = Integer.parseInt(intInput);
       } catch (Exception e){ //예외가 발생했을 떄 그 예외가 언떤 예외인지를 나타내는 변수
           System.out.println("숫자로 입력해 주세요");
       }

    }

}


