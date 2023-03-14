package new_chaptor_01;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch case
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그 외 : 장학금 대상 아님
        // If Else 문을 이용
        int ranking = 4; //1등
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");
//  Switch case 문을 이용
        ranking = 4;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.err.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");
        // case 2 와 3을 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;

            default:
                System.out.println("장학금 대상 아님");

        }
        System.out.println("조회 완료 #3");

        // ex 중고상품의 등급에 따른 가격을 책정 (1급 : 최상,4급 : 최하)
        int grade = 1; //등급
        int price = 7000; // 기본가격
        switch (grade) {
            case 1:
                price += 2000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 0;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 10000원 //1등급이 만원인 이유는  case 1 ,2 에 break를 달아주지
        //않아서 계속 덧셈이 된다
        // 2등급 제품의 가격 :  9000원


        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그 외 : 장학금 대상 아님

        //if else
        int rank = 1;
        if (rank == 1) {
            System.out.println("전액 장학금 대상입니다");
        } else if (rank == 2 || rank == 3) {
            System.out.println("반액 장학금 대상");
        } else {
            System.out.println("장학금 대상 x");
        }
        System.out.println("조회 완료");

        //switch case

        rank = 1;
        switch (rank) {
            case 1:
                System.out.println("장학금 대상 입니다");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금 대상 입니다");
                break;
            case 4:
                System.out.println("장학금 대상이 아닙니다");
                break;
            default:
                System.out.println("x");
        }
        System.out.println("조회 완료");

        // ex 중고상품의 등급에 따른 가격을 책정 (1급 : 최상,4급 : 최하)
        int gradeGrade = 2;
        int gradeMoney = 6000;
        switch (gradeGrade) {
            case 1:
                gradeMoney += 1000;
            case 2:
                gradeMoney += 1000;
            case 3:
                gradeMoney += 1000;

            case 4:
                gradeMoney += 1000;
                System.out.println(gradeGrade + "등급 제품의 가격은" + gradeMoney + "입니다");

                if (gradeGrade == 1) {
                    System.out.println("그렇지 1등급 골라야지");
                    System.out.println(" 근데1등급이 좀 비싸 ");
                    break;

                }
        }


    }


}




