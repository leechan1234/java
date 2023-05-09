package day13;

class Person {
	void wake() {
		System.out.println("7시에 기상");
	}
}
class Anony {
	// 인스턴스 변수 초기값으로 대입 
	Person p = new Person() {
		void work() {
			System.out.println("출근~~~");
		}
		@Override
		void wake() {
			System.out.println("6시에 기상!!!");
			work(); 
		}
	};
	
	void func() {
		// 지역 변수 값으로 대입 
		Person localP = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("7시에 기상");
				walk(); // 기능이 많을경우 메서드로 따로 빼서 작업 가능
			}
		}; 
		
		// 지역변수 사용 
		localP.wake();
		
	}
	
	// 매개변수 값 대입 
	void func2(Person p) {
		p.wake(); 
	}
	
}

public class Test142 {
	public static void main(String[] args) {

		Anony anony = new Anony(); 
		anony.p.wake();
		anony.func(); 
		
		anony.func2(new Person() {
			void study() {
				System.out.println("공부한닷!!!!");
			}
			@Override
			void wake() {
				System.out.println("8시에 기상~~~");
				study(); 
			}
		});
		
		
		
	}
}
