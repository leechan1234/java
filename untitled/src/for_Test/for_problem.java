package for_Test;

public class for_problem {
    public static void main(String[] args) {
//        int sum = 0; // 5의 배수를 담을 변수
//        for (int i = 1; i <=100 ; i++) {
//            if (i % 5 ==0){//5로 나누어 떨어질시 5의 배수만 찾는 조건
//                sum += i; // 변수에 i(5의배수) 합계 저장
//            }
//        }
//        System.out.println("5의 배수의 합계는 : " + sum);
//            int evenSum = 0; //짝수 담을 변수
//            int oddSum = 0; //홀수 담을 변수
//        for (int i = 1; i <= 100 ; i++) { //i = 1 ~100
//            if (i % 2 == 0){ //짝수 조건
//                evenSum += i;
//            }else {   //짝수가 아닐시 나머지 숫자(홀수)
//                oddSum += i;
//            }
//        }
//        System.out.println("1~100 까지 짝수의 합계는 : " + evenSum);
//        System.out.println("1~100 까지 홀수의 합계는 : " + oddSum);

//        System.out.println(evenSum);
//        System.out.println(oddSum);

//        for (int i = 1; i <= 6 ; i++) {//1 ~ 6 출력
//            for (int j = 1; j <=6 ; j++) {
//                if (i + j == 6){ // i 또는 j 의 합이 6일 될시 조건 true
//                    System.out.println("(" + i +"," + j + ")");
//                }
//            }
//
//        }


//        for (int i = 1; i <=5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for (int i = 5; i >0 ; i--) {
//            for (int j = 0; j <i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n = 5; // 공백 처리 변수
//        for (int i = 0; i < n; i++) { // n = 5
//            for (int j = 1; j < n - i; j++) {//첫번째 i의 0이 2번째 for문에 대입
//                System.out.print(" "); // 첫번째 자리 공백 처리 후 4번째까지 처리(1,2,3,4)
//            }
//            for (int j = 0; j < i * 2 + 1; j++) { // 별 출력 코드 첫번째 i가 0이므로 첫자리는 1 이후 +2씩 증가
//                System.out.print("*");//별 출력
//            }
//            System.out.println();// 5번째 자리 까지 줄 바꿈
//        }
        int count = 0; // 6이 나오기까지 총 굴린 횟수
        while (true){
            int dice =(int)(Math.random() * 6) +1; // 1 ~ 6 랜덤 값 생성
            System.out.println("(" + dice+ ")");
            count++; // 굴린횟수 증감 연산자
            if (dice == 6){ // 6이 될시  랜덤값 중단을 하고 총 굴린 횟수 출력
                System.out.println("6이 나오기 까지 주사위를 굴린 횟수 : " + count + "번");
                break;
            }

        }

    }
}




