package day05;

import java.util.Scanner;

public class Test48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //문제1-1. int형 5개 방의 배열을 만들고 10,20,30,40,50 을 저장, 출력해보세요.
//        int[] arr = {10,20,30,40,50};
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
        //문제1-2. 위 배열을 이용하여, 인덱스번호 1번과 3번방에 있는 데이터를 더한값을 출력.
//        int[] arr = {10,20,30,40,50};
//        System.out.println(arr[1] + arr[3]);
        //문제1-3. 인덱스번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력.
//       int[] arry = {10,20,30,40,50};
//       int input = scanner.nextInt();
//        System.out.println(arry[input]);
        //문제1-4. 배열안의 모든 데이터를 더한 값을 출력
//       int[] arry = {10,20,30,40,50};
//        int tot = 0;
//        for (int i = 0; i < arry.length ; i++) {
//            tot += arry[i];
//        }
//        System.out.println(tot);
//	문제1-5. 배열안에 있는 값중 하나를 입력하면, 그 값이 위치한 인덱스번호를 출력.
//        int[] arry = {10,20,30,40,50};
//        int user = scanner.nextInt();
//        for (int i = 0; i <arry.length ; i++) {
//            if (user == arry[i]){
//                System.out.println(i);
//            }
//        }
//



		//문제1-6. 인덱스번호 2번과 4번방의 값을 교환해보세요.
        int[] arry = {10,20,30,40,50};
        int tmp= arry[2];
         arry[2]=arry[4];
         arry[4] = tmp;
        for (int i = arry.length; ; i++) {
            System.out.println(arry[i]);
        }


//문제1-7. (심화) 배열안의 데이터를 내림차순으로 정렬해보세요.(큰수 -> 작은수)




    }
}
