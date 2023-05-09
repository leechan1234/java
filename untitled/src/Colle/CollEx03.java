package Colle;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Scanner;

/*
	id와 tel(전화번호)로 구성되는 Student클래스를 만들고, 
	이름을 key로 하고 Student객체를 값으로 하는 해쉬맵을 작성해보세요.
	이름을 검색하면 id와 전화번호 출력되고, exit 입력하면 프로그램 종료. 
*/
class Student{
	String id;
	String tel;

	public Student(String id, String tel) {
		this.id=id ;this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
}
public class CollEx03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> map = new HashMap<>(); //학생 객체 생성
		map.put("홍길동", new Student("20210001", "010-1234-5678"));
		map.put("김철수", new Student("20210002", "010-2345-6789"));
		map.put("이영희", new Student("20210003", "010-3456-7890"));
		//학생 등록
		while (true){ // 반복
			System.out.println("이름을 입력 하십시오 >>");
			String name = scanner.nextLine();

			if (name.equals("exit")){
				System.out.println("프로그램 종료");
				break;
			}
			//학생이름검색하면  id와 전화번호 출력
			if (map.containsKey(name)){
				Student student =map.get(name);
				System.out.println(name + "의 id :" + student.getId() + "tel : " + student.getTel());
			}

		}



	}
}
