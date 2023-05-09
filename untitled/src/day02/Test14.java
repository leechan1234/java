package day02;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {

        // 증감연산자 :  ++(변수값을 1더해서 저장), -- (변수값을 1빼서 저장)
        // 전위형 : ++a  : 나먼저 연산
        // 후위형 : a++	 : 다른연산 먼저하고 나는 나중에

//		int a = 10;
//		System.out.println(a);
//		++a;
//		System.out.println(a); // 11
//		a--;
//		--a;
//		System.out.println(a);// 9
//
//		int b = 10;
//		System.out.println(++b); // 11
//		System.out.println(b++); //11
//		System.out.println(b);//12


        //산술연산자 문제
        //문제1. 정수 2개를 입력받고, 사칙연산의 결과를 출력해보세요.
        Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//
//		System.out.println(a+b);
        //문제2. 초단위로 정수를 입력받고, ?분?초 형태로 출력해보세요.

//		int second = scanner.nextInt();
//		System.out.println((second/60) + "분" + (second % 60) + "초");
        //문제3. 초단위로 정수를 입력받고, ?시간?분?초 형태로 출력해보세요.
//        int user = scanner.nextInt();
//        int hour = (user / 3600);
//        int minute = (user % 3600) / 60;
//        int second = (user % 60);
//        System.out.println(hour + "시간" + minute + "분" + second + "초");

      /*문제4. 최소 화폐매수 구하기 : 금액을 입력하면 최소한의 화폐매수를 구해주는 프로그램
               콘솔예)
               금액입력 : 67800    (<-사용자가 금액입력)
               5만원 : 1장
               1만원 : 1장
               5천원 : 1장
               1천원 : 2장
             5백원 : 1개
             1백원 : 3개
      */
//        int user = scanner.nextInt();
//        int oman = user / 50000;
//        int ilman = (user % 50000) / 10000;
//        int ochen = (user % 10000) / 5000;
//        int ilchen = (user % 5000) / 1000;
//        int obec = (user % 1000) / 500;
//        int bec = (user % 500) / 100;
//        System.out.println("오만 : " + oman);
//        System.out.println("만원 : " + ilman);
//        System.out.println("오천 : " + ochen);
//        System.out.println("일천 : " + ilchen);
//        System.out.println("오백 : " + obec);
//        System.out.println("백원 : " + bec);

		// 증감연산자 문제
		// 문제5. 결과를 먼저 주석으로 작성하고, 실행해서 맞는지 확인해봅시다.
		int i = 5, j = 5;
		System.out.println(i++); // 5
		System.out.println(++j); // 6
		System.out.println("i = " + i + ", j = " + j); // 6 6

//		// 문제6. 결과를 먼저 주석으로 작성, 실행해서 확인
//		int k = 10;
//		System.out.println(k++); //10
//		System.out.println(++k);// 12
//		++k;   //13
//		System.out.println(++k);//14
//		System.out.println(k++);//14
//		System.out.println(k);//15

		// 문제7. 결과를 먼저 주석으로 작성, 실해해서 확인
		int a = 10;
		int b = 10;
		int r = ++a + ++b;  // 11 + 11  = 22
		r = ++a + b++;      // 1   1
		r = ++a + a;         //  2  2
 		r = ++a + a++;       //  3  3
		r = ++a + ++a;       //  5  5
		System.out.println(r);




    }
}
