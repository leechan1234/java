package _Mini_Project;

import java.util.Arrays;
import java.util.Scanner;

public class Boss {
    public static void sout() {
        System.out.println("설명!!\n 알맞은 스킬로 보스를 퇴치해야한다 총 5단계\n" + "상황에 맞게 힌트를 부여를 해주어 그에 맞는 스킬을 골라 퇴치\n" + "스킬 목록은 단계마다 3개씩 보여준다\n" + "알맞은 스킬로 5단계 클리어시 보스를 처치하지만 \n" + "틀릴 경우 패배하게 된다 " +
                "게임 플레이 원하면 " + "\"네\" " + "라고 입력해주십시오");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] SkillList1 = {"1.파이어 애로우 , 2.아이스블라스트 , 3.소드어택"};
        String[] SkillList2 = {"1.카운터 2.방어하기 3.쉴드"};
        String[] SkillList3 = {"1.파이어애로우 2. 숄드어택 3. 바위치기"};
        String[] SkillList4 = {"1.전투태새 2.상급치료 3.대폭 쉴드"};
        String[] SkillList5 = {"1.궁극 : 미사일 폭격 2. 궁극 : 급습 3. 궁극 : 종말의 날"};
        //단계 정답
        int current = 0;
        int BossTarget = 0;
        int lastTarget = 0;

        sout();
        String userInput = scanner.nextLine();
        if (userInput.equals("네")) {
            System.out.println("게임 시작");
        } else {
            System.out.println("잘못 입력 하였습니다");
            System.exit(0);
        }

        for (int i = 0; i < 4; i++) {
            switch (i + 1) {
                case 1:
                    System.out.println("던전을 파괴하여 드디어 보스를 찾았다");
                    System.out.println("1단계 :  보스의 hp는 총 50 알맞은 스킬로 제압해야한다(보스는 불에 취약하다)\n  " + Arrays.toString(SkillList1));
                    int choose = scanner.nextInt();
                    if (choose == 1) {
                        current++;
                    }
                    break;
                case 2:
                    System.out.println("2단계 : 보스에게 피해를 주었지만 어느 정도인지 알수없다 다음 공격을 대비하자\n " + Arrays.toString(SkillList2));
                    int choose1 = scanner.nextInt();
                    if (choose1 == 2) {
                        current++;
                    }
                    break;
                case 3:
                    System.out.println("3단계 : 보스의 공격을 잘 막아낸 것 같다 보스를 공격해보자  (보스가 벽 뒤에 숨은 것 같다)\n " + Arrays.toString(SkillList3));
                    int choose2 = scanner.nextInt();
                    if (choose2 == 3) {
                        current++;
                    }
                    if (current == 3) {
                        System.out.println("\n" + "보스가 도망가서 치료를 하려는 것 같다 어서 3가지 방 중에서 하나를 골라 \n" + "보스를 찾아야 한다");
                    } else {
                        System.out.println("보스에게 알맞은 공격을 하지 못하여 패배 하였습니다");
                        System.exit(0);
                    }
            }
        }

        for (int i = 0; i <3; i++) {
            switch (i+1) {
                case 1:
                    System.out.println("1번방에서 끔찍한 냄새가난다");
                    System.out.println("2번방에서 위험한 소리가 난다");
                    System.out.println("3번방에서 바람 소리가 난다");
                    System.out.println("{ 1, 2, 3}");
                    int targetRoom = scanner.nextInt();
                    if (targetRoom == 3) {
                        BossTarget++;
                        break;
                    }
                case 2:
                    System.out.println("1번방에서 수상한 기운이 느껴진다");
                    System.out.println("2번방에서 총소리가 난다");
                    System.out.println("3번방에서 향기로운 냄새가 난다");
                    System.out.println("{ 1, 2, 3}");
                    int targetRoom1 = scanner.nextInt();
                    if (targetRoom1 == 1) {
                        BossTarget++;
                        break;
                    }
                case 3:
                    System.out.println("1번방에서 알수없는 예감이 든다");
                    System.out.println("2번방에서 보스의 위험이 느껴진다");
                    System.out.println("3번방에서 몬스터들의 위험이 느껴진다");
                    System.out.println("{ 1, 2, 3}");
                    int targetRoom2 = scanner.nextInt();
                    if (targetRoom2 == 2) {
                        BossTarget++;
                        break;
                    }
            }
            if (BossTarget == 3) {
                System.out.println("보스를 찾았습니다!!");
            } else {
                System.out.println("보스를 찾지 못하고 몬스터에게 둘러싸여 사망 하였습니다");
                System.out.println("프로그램 종료");
                System.exit(0);

            }
            for (int j = 0; i < 3; j++) {
                switch (i + 1) {
                    case 1:
                        System.out.println("4단계 : 보스가 힘들어 하는 기세를 보였지만 나에게 큰 공격을 하여 막대한 피해를 입었다 내가 취해야 할 행동은?\n  " + Arrays.toString(SkillList4));
                        int choose4 = scanner.nextInt();
                        if (choose4 == 2) {
                            lastTarget++;
                        }
                        break;
                    case 2:
                        System.out.println("5단계 :  이제 마지막이다 모든 능력을 최상위로 끌어내 보스를 처치 해야한다)\n  " + Arrays.toString(SkillList5));
                        int choose5 = scanner.nextInt();
                        if (choose5 == 3) {
                            lastTarget++;
                        }
                        break;
                }
            }
            if (lastTarget == 2) {
                System.out.println("축하합니다 보스의 hp가 0이되어 처치에 성공하였습니다");
            } else {
                System.out.println("보스가 마지막 남은 힘을 사용해 주인공은 사망 하였습니다.");
            }
        }
    }
}


















