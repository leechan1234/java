package Colle;

// HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요. 
// 학생이름 key, 점수 value (단, 학생이름은 중복안된다는 가정하에 작업하세요)
// 아래 프로그램 메뉴에서 각 번호로 서비스 선택하고, 6번을 입력받으면 프로그램 종료. 
/*
 	** 자바 성적 관리 프로그램 **
	1. 전체 조회 
	2. 등록
	3. 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료
*/

import java.util.HashMap;
import java.util.Scanner;

public class CollEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            System.out.println("** 자바 성적 관리 프로그램 **");
            System.out.println("1.전체조회 \n2.등록\n3.수정\n4.삭제\n5.전체평균\n6.프로그램 종료");
            System.out.println("원하는 번호를 입력하세요>>");
            int user = scanner.nextInt();
            scanner.nextLine();

            switch (user) {
                case 1: // 전체 조회
                    if (map.isEmpty()) {
                        System.out.println("등록된 학생이 없습니다");
                    } else {
                        System.out.println("학생 목록");
                        for (String name : map.keySet()) {
                            System.out.println(name + " 점수 : " + map.get(name));
                        }
                    }
                    break;
                case 2: // 학생 등록
                    System.out.println("등록하실 학생 이름 입력 >>");
                    String name = scanner.nextLine();
                    System.out.println("등록하실 학생 점수 입력 >>");
                    int score = scanner.nextInt();
                    //등록 완료
                    if (map.containsKey(name)) {
                        System.out.println("이미 등록된 학생입니다");
                    } else {
                        map.put(name, score);
                        System.out.println(name + "학생이" + score + "점으로 등록 되었습니다");
                    }
                    break;
                case 3: //수정
                    System.out.println("수정 할려는 학생의 이름을 입력 >>");
                    name = scanner.nextLine();

                    if (map.containsKey(name)) {
                        System.out.println(name + "학생의 수정할 점수 입력 >>");
                        score = scanner.nextInt();

                        map.put(name, score);
                        System.out.println(name + "학생의 점수가" + score + "로 수정되었습니다");
                    }else {
                        System.out.println("등록되지 않은 학생입니다");
                    }
                    break;
                case 4: //삭제
                    System.out.println("삭제할려는 학생이 이름을 입력 하세요>>");
                    name = scanner.nextLine();
                    if (map.containsKey(name)){
                        map.remove(name);
                        System.out.println(name + "학생이 삭제 되었습니다");
                    }
                case 5: //전체평균
                    int tot =0;
                    if (map.isEmpty()){
                        System.out.println("등록된 학생이 없습니다");
                    }else {
                        for (String names: map.keySet()) {
                            tot+=map.get(names);
                        }
                        double avg = tot/map.size();
                        System.out.println("전체 평균은 " + avg + "입니다");
                    }
                    break;
                case 6 :
                    System.out.println("프로그램 종료");

            }

        }
    }


}

