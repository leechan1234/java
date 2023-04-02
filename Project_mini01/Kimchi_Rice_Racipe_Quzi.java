package Project_mini01;

import java.util.Scanner;

public class Kimchi_Rice_Racipe_Quzi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("★☆ ★☆ 김치 볶음밥 만들기 ★☆ ★☆ \n 어서오세요 김치 볶음밥 만들기 프로그램 입니다. \n 알맞은 답을 입력하시오");

        String[] ingredients1 = {"1.김치", "2.가지", "3.단무지"};
        String[] ingredients2 = {"1.사과", "2.버섯", "3.밥"};
        String[] ingredients3 = {"1.메주", "2.고춧가루", "3.된장"};
        String[] ingredients4 = {"1.치킨", "2.햄", "3.닭가슴살"};
        String[] ingredients5 = {"1.각종 야채", "2.시리얼", "3.요구르트"};
       // int[] answers = new int[5]; // 사용자 입력결과값을 저장할 int 배열 생성
        int correctCount = 0; // 사용자가 정답을 맞춘 횟수를 저장하는 변수입니다.
        for (int i = 0; i < 5; i++) {
            switch (i + 1) {
                case 1:
                    System.out.println("1단계 : " + ingredients1[0] + ", " + ingredients1[1] + ", " + ingredients1[2]);
                    break;
                case 2:
                    System.out.println("2단계 : " + ingredients2[0] + ", " + ingredients2[1] + ", " + ingredients2[2]);
                    break;
                case 3:
                    System.out.println("3단계 : " + ingredients3[0] + ", " + ingredients3[1] + ", " + ingredients3[2]);
                    break;
                case 4:
                    System.out.println("4단계 : " + ingredients4[0] + ", " + ingredients4[1] + ", " + ingredients4[2]);
                    break;
                case 5:
                    System.out.println("5단계 : " + ingredients5[0] + ", " + ingredients5[1] + ", " + ingredients5[2]);
                    break;
            }

            }

        }



    }

