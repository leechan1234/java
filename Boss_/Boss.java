package Boss_;

import java.util.Random;
import java.util.Scanner;

public class Boss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       int humanAttack = random.nextInt(11) + 5; //보스의 공격력 5부터 15까지 랜덤한 값 생성
      int bossAttack = random.nextInt(11) + 5; // 주인공의 공격력 5부터 15
        int boss = 50; //50
        int human = 50; //40
        int Defense = 5;
        int current = 0; //정답 횟수
//        System.out.println("주인공과 보스가 만나 싸움을 시작 합니다.\n" +
//                "#설명\n" +
//                "상황에 맞게 공격하거나 방어를 적절히 섞어서 퇴치해야 합니다");
//        System.out.println("계속 진행 하려면 " + "\"네\"" + "를 입력해주세요");
//        String USerInput = scanner.nextLine();
//
//        if (USerInput.equals("네")) {
//            System.out.println("게임을 시작 합니다");
//        } else {
//            System.out.println("게임을 종료 합니다");
//        }
//        System.out.println("---------------------------");
//        System.out.println("보스의 공격력은 5~15로 랜덤 고정\n" +
//                "주인공의 공격력은 상황별로 랜덤\n" +
//                "보스의 HP 50\n" +
//                "주인공 HP 40");
//
//        //1라운드 대전
//        System.out.println("<1라운드> \n1.공격(몸통박치기)\n" +
//                "2.방어(방어할시 피해 5로 고정)\n");
//        int attack = scanner.nextInt();
//        if (attack == 1) {
//             bossAttack = random.nextInt(6) + 5; //1라운드 주인공의 공격력 5 - 10 랜덤 값 생성
//            boss -= bossAttack;
//            System.out.println("주인공이 보스에게 몸통 박치기를 하여 피해를 " + bossAttack + " 입혔습니다." + "\n보스의 hp : " + boss);
//             humanAttack = random.nextInt(11) + 5;
//            human -= humanAttack;
//            System.out.println("보스 또한 주인공을 공격하여 피해를 " + humanAttack + "입혔습니다. " + "\n주인공의 hp : " + human);
//        } else if (attack == 2) {
//            human -= Defense;
//            System.out.println("주인공이 보스의 공격을 방어해 피해를 " + Defense + "밖에 받지 않았습니다. \n주인공의 hp :" + human + "\n 보스의 hp " + boss);
//        }
////2라운드
//        System.out.println("<2라운드>");
//        System.out.println("1.공격(몸통박치기)\n2.방어하기\n3.2차전직 : 블레이드");
//        int attack2 = scanner.nextInt();
//        switch (attack2) {
//            case 1:
//                 bossAttack = random.nextInt(6) + 5;
//                boss -= bossAttack;
//                System.out.println("주인공이 보스에게 몸통박치기 공격을 시전하여 피해를" + bossAttack + "입혔습니다" + "보스의 hp : " + boss + "입니다.");
//                 humanAttack = random.nextInt(11) + 5;
//                human -= humanAttack;
//                System.out.println("보스 또한 주인공을 공격하여 피해를 " + humanAttack + "입혔습니다. " + "\n주인공의 hp : " + human);
//                break;
//            case 2:
//                human -= Defense;
//                System.out.println("주인공이 보스의 공격을 방어해 피해를 " + Defense + "밖에 받지 않았습니다. \n주인공의 hp :" + human + "\n 보스의 hp " + boss);
//                break;
//            case 3:
//                System.out.println("주인공이 블레이드로 2차전직 하여 새로울 스킬을 습득 하였습니다!!");
//                 humanAttack = random.nextInt(11) + 5;
//                human -= humanAttack;
//                System.out.println("보스가 주인공을 공격하여 피해를 " + humanAttack + "입혔습니다. " + "\n주인공의 hp : " + human);
//                human += 5;
//                System.out.println("전직 보너스로 hp5를 얻었습니다 주인공의 hp : " + human);
//
//                System.out.println("<3라운드>");
//                System.out.println("1.단검베기\n" + "2.치료\n" + "3.다크사이트");
//                int attack3 = scanner.nextInt();
//                if ( attack3==1){
//                    bossAttack = random.nextInt(11) + 8;
//               boss -= bossAttack;
//               System.out.println("보스에게 단검베기를 시전합니다.\n 보스에게 " + bossAttack + "피해를 입혔습니다.\n 보스의 hp : " + boss);
//                } else if (attack3 == 2) {
//                    System.out.println("치료를 시전합니다 (13~20 랜덤)");
//                    int cure = random.nextInt(8) + 13;
//                    human += cure;
//                    System.out.println("주인공의 hp : " + human);
//                    boss += 7;
//                    System.out.println("보스 또한 회복을 하여 보스의 hp :" + boss);
//                } else if ( attack2 ==3) {
//                    System.out.println("다크사이트 시전! 1턴 동안 숨어 보스의 약점을 찾습니다(보스의 방어력 하락)");
//                    bossAttack = random.nextInt(10) + 10; // 10~19;
//                }
//                }
                //4,5,6라운드 for문을 이용한 switch 문
        for (int i = 0; i <3 ; i++) {
            switch (i+1){
                case 1 : // 4라운드
                    System.out.println("4라운드\n" +
                            "여기서부턴 알맞은 공격을 해야 할 것 같다 (상황을 파악하고 공격하자)\n" +
                            "보스가 힘들어하는 기세를 보이며 잠시 주저 앉습니다...\n" +
                            "[1.소닉블레이드 2. 3단발차기 3. 단검강화]");
                    int user = scanner.nextInt();
                    if (user == 1){
                        current++;
                        System.out.println("소닉블레이드 시전! 총 5번의 연속공격을 합니다");
                        for (int j = 1; j <= 5 ; j++) {
                            System.out.println((bossAttack = random.nextInt(4)+3) +"의 피해를 입혔습니다");
                            boss -= bossAttack;
                        }
                        if (user == 1){

                            System.out.println("보스 또한 공격을 하여 주인공에게 피해를 " + humanAttack + "피해를 입혔습니다" );
                            human -= humanAttack;
                            System.out.println("보스의 hp : " + boss);
                            System.out.println("주인공 hp : " + human);
                        }
                    }
                case 2 :
            }
        }
        if (current == 3) {
            System.out.println("보스한테 알맞은 공격을 하여 다음 라운드를 이어 갑니다");
        } else {
            System.out.println("보스가 반격을 하여 주인공의 hp가 0이 되어 사망하였습니다");
            System.out.println("프로그램 종료");
            System.exit(0);

        }
                

            }


        }
       


        //전투종료 조건
//            if (boss <= 0) {
//                System.out.println("축하드립니다 보스와의 전투에서 승리 하였습니다");
//
//            } else if (human <= 0) {
//                System.out.println("보스와의 전투에서 패배 하였습니다");







