package Project_mini01;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ingredients1 = {"1.김치", "2.가지", "3.맛술", "4.굴소스"};
        String[] ingredients2 = {"1.사과", "2.버섯", "3.밥", " 4.당근"};
        String[] ingredients3 = {"1.레몬", "2.고춧가루", "3.된장", "4.굴"};
        String[] ingredients4 = {"1.치킨", "2.햄", "3.닭가슴살", "4.소고기 "};
        String[] ingredients5 = {"1.각종 야채", "2.시리얼", "3홍합.", "4.계란"};

        System.out.println("★☆ ★☆ 김치 볶음밥 만들기 ★☆ ★☆ \n 어서오세요 김치 볶음밥 만들기 프로그램 입니다. \n 알맞은 답을 입력하시오");
        int current = 0;  // 사용자가 정답을 맞춘 횟수를 저장하는 변수입니다.
        for (int i = 0; i < 5; i++) {
            switch (i + 1) {
                case 1:
                    System.out.println("1단계 : " + ingredients1[0] + "," + ingredients1[1] + "," + ingredients1[2] + "," + ingredients1[3]);
                    int choose = scanner.nextInt();
                    if (choose == 1) { // 문제의 정답
                        current++;     // 정답시 값 1씩증가
                    }
                    break;
                case 2:
                    System.out.println("2단계 : " + ingredients2[0] + "," + ingredients2[1] + "," + ingredients2[2] + "," + ingredients2[3]);
                    int choose1 = scanner.nextInt();
                    if (choose1 == 3) {
                        current++;
                    }
                    break;
                case 3:
                    System.out.println("3단계 : " + ingredients3[0] + "," + ingredients3[1] + "," + ingredients3[2] + "," + ingredients3[3]);
                    int choose2 = scanner.nextInt();
                    if (choose2 == 2) {
                        current++;
                    }
                    break;
                case 4:
                    System.out.println("4단계 : " + ingredients4[0] + "," + ingredients4[1] + "," + ingredients4[2] + "," + ingredients4[3]);
                    int choose3 = scanner.nextInt();
                    if (choose3 == 2) {
                        current++;
                    }
                    break;
                case 5:
                    System.out.println("5단계 \n 2가지 고르시오 : " + ingredients5[0] + "," + ingredients5[1] + "," + ingredients5[2] + "," + ingredients5[3]);
                    int choose4 = scanner.nextInt();
                    int choose5 = scanner.nextInt();

                    if (choose4 == 1 || choose5 == 4) { // 마지막 문제는 두개의 정답
                        current++;
                    }
                    break;
            }
        }
        if (current == 5) { // 5문제 전부 맞추게 되면 총 5가 되어 조건이 맞기에 김치볶음밥 완성
            System.out.println("축하합니다 김치 볶음밥이 완성 되었습니다!!");
        } else {
            System.out.println("잘못만들었습니다");
        }

    }
}