package _prob01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //컴퓨터값 랜덤
        //랜덤 값은 0~0.9999999999*9+1
        int com1 = 0; //while문에서 선언하면 지역변수가 되므로 미리 선언
        int com2 = 0;
        int com3 = 0;

        //중복이 될 경우 랜덤 값 뽑기 무한반복
        while(true) {
            com1 = (int)(Math.random()*9)+1; //랜덤으로 받은 값, int로 변환
            com2 = (int)(Math.random()*9)+1;
            com3 = (int)(Math.random()*9)+1;

            //중복값 방지
            if(!(com1 == com2 || com1 == com3 || com2 == com3)) {
                break;
            }
        }

        //사용자 값 스캐너 입력
        int user1 = 0;
        int user2 = 0;
        int user3 = 0;

        //S,B,O 변수 설정
        int strike = 0, ball = 0, out = 0;
        //System.out.printf("%s%s%s%n", com1,com2,com3);

        //스캐너는 한번만 돌 수 있도록 반복문 밖에서 설정
        Scanner sc = new Scanner(System.in);

        //while문 무한루프
        while(true) {
            strike = 0; //새 게임 할 때마다 값을 초기화 (값이 누적되지 않도록)
            ball = 0;
            out = 0;

            System.out.println("첫번째 숫자를 넣으세요(1~9).>");
            user1 = sc.nextInt(); //바깥에서 초기화 하고 안에서 변수값 설정
            System.out.println("두번째 숫자를 넣으세요(1~9).>");
            user2 = sc.nextInt();
            System.out.println("세번째 숫자를 넣으세요(1~9).>");
            user3 = sc.nextInt();

            if(com1 == user1) {
                strike++;
            }else if(com1 == user2) {
                ball++;
            }else if(com1 == user3) {
                ball++;
            }
            if(com2 == user2) {
                strike++;
            }else if(com2 == user1) {
                ball++;
            }else if(com2 == user3) {
                ball++;
            }
            if(com3 == user3) {
                strike++;
            }else if(com3 == user1) {
                ball++;
            }else if(com3 == user2) {
                ball++;
            }
            out = 3 - (strike + ball);

            System.out.printf("%sS %sB %sO %n", strike,ball,out);
            if(strike == 3) {
                break;  //빠져나가기 전에 찍어라!
            }
        }
        System.out.println("빙고!!");
    }


}
