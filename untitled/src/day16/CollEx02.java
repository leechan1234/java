package day16;

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
		HashMap<String,Integer> stu = new HashMap<String,Integer>();
		while (true){
			System.out.println("** 자바 성적 관리 프로그램 **\n" +
					"\t1. 전체 조회 \n" +
					"\t2. 등록\n" +
					"\t3. 수정\n" +
					"\t4. 삭제\n" +
					"\t5. 전체 평균\n" +
					"\t6. 프로그램 종료");
			int user = scanner.nextInt();
			scanner.nextLine();
			switch (user){
				case 1:
					if ( stu == null){
						System.out.println("등록되지 않은 학생 입니다");
					}else {
						for (String name: stu.keySet()
							 ) {
							int score = stu.get(name);
							System.out.println(name + "의 점수" + score);
						}
					}
					break;
				case 2:
					System.out.println("등록할 학생의 이름 입력");
					String name = scanner.nextLine();
					System.out.println("학생 점수 입력");
					int score = scanner.nextInt();
					scanner.nextLine();
					stu.put(name,score);
					System.out.println(name + "등록이 완료 되었습니다");
					break;
				case 3 :
					System.out.println("수정할 학생을 입력 하세요");
					String name1 = scanner.nextLine();
					if (stu.containsKey(name1)){
						System.out.println("현재" + name1 +"의 점수는" + stu.get(name1) );
						System.out.println("수정할 점수를 입력 하시오");
						int score1 = scanner.nextInt();
						scanner.nextLine();
						stu.put(name1,score1);
						System.out.println(score1 + "로 수정 되었습니다");
					}
					String a= "";

			}
		}

		
		
		
		
		
	}
}
