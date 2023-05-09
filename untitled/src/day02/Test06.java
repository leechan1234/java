package day02;

public class Test06 {

    public static void main(String[] args) {

        // 출력문
        System.out.print("hello");
        System.out.print("java");
        System.out.println("1234");
		
		/*
		 * 서식문자 
		 	%d	: 정수 
		 	%f	: 실수
		 	%c	: 문자1개
		 	%s	: 문자열 
		 */
        String age = "50";
        System.out.printf("당신의 나이는 %s살 입니다.\n", age);

        System.out.printf("%s\n", "서식문자이용한 출력");

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 출력문 안에서의  연산
        System.out.println(10 + 3);
        System.out.println("aaa" + "bbb" + "ccc");
        System.out.println('A' + 10); // 아스키코드값 : '0' = 48, 'A' = 65, 'a' = 97
        System.out.println("A" + 10);
        System.out.println(10 + 5 + "A");

    }

}
