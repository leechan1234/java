package day06;

import java.util.Scanner;

public class Test52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		/*
		// * 1차원 배열 *
		//문제1-1. arr이라는 이름의 하나의 배열에 사용자로부터 서로다른 5개의 정수를 입력받아
		//			배열에 저장하고, 전체 출력해보세요. 
		int [] arr = new int[5]; 
		
		// 정수 입력받아 저장 
		for(int i = 0; i < arr.length; i++) {
			System.out.println("정수 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			arr[i] = num; 
		}
		// 전체 출력 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//문제1-2. 위에서 만든 배열 arr에 저장된 값들을 오름차순으로 정렬해보세요.(작->큰) 
		// 정렬 
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
		// 전체 출력 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//문제1-3. 정수 한개를 더 입력받아 위 arr 배열에 저장해보세요. 
		//			입력받은 정수는 arr 배열 마지막 데이터 다음 방에 저장되어야한다.
		//			즉 방크기가 6개가 되어야한다. 단, 배열은 방크기 수정 불가능. 
		// 임시 배열에 arr 주소를 복사해둔다 (나중에 임시변수로 기존 데이터 저장공간 접근가능하게) 
		int[] tArr = arr; 
		
		// 기존 arr변수에 새로 6개짜리 방을 할당한다. 
		arr = new int[6]; 
		// 원래 저장되었던 데이터를 새로운 방에 다시 옮긴다. 
		for(int i = 0; i < tArr.length; i++) {
			arr[i] = tArr[i]; 
		}
		// 마지막 6번째 방에 새로운 값 입력 받아 저장 
		System.out.println("새 정수 추가 : ");
		arr[5] = Integer.parseInt(sc.nextLine()); 
		
		// 전체 출력해 확인 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		
		//문제2-1. 게임랭킹보드. 각 5개의 데이터를 저장할 수 있는 
		//			users와 scores라는 이름의 배열이 있고, 
		//			users 배열에는 유저네임, scores 배열에는 유저의게임 점수를 입력받아 저장한다. 
		//			단, 유저네임과 게임점수 배열의 인덱스번호가 일치하게 저장. 
		//			ex) users[0] 방 유저네임의 게임점수는 scores[0] 방에 저장 
		String[] users = new String[5]; // 유저 이름들 저장할 배열 
		int [] scores = new int[5]; 	// 게임 점수들 저장할 배열 
		
		for(int i = 0; i < users.length; i++) { // 5번(users의 길이만큼) 반복 
			// 유저 네임 입력받아 저장
			System.out.print("유저 네임>>");
			//  어차피 입력받은거 바로 배열에 저장하므로 한줄로 줄일 수 있음. 
			//String name = sc.nextLine(); 
			//users[i] = name;
			users[i] = sc.nextLine(); 
			// 게임 점수 입력받아 저장 
			System.out.print("점수>>");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		
		
		//문제2-2. 위 저장된 users와 scores를 아래와 같은 형태로 전체 출력해보세요. 
		//		출력예) 	user_name		score
		//				--------------------------------
		//					피카츄			87
		//					파이리			24
		//					....
		System.out.println("user_name\t score");
		System.out.println("---------------------");
		for(int i = 0; i < scores.length; i++) {
			System.out.println(users[i] + "\t\t" + scores[i]);
		}
		
		
		//문제2-3. 두번째 유저의 점수와 세번째 유저의 점수가 서로 바뀌어 저장되었다합니다. 
		//		점수를 교환해 주세요. idx = 1, idx = 2
		int tmp = scores[1]; 
		scores[1] = scores[2]; 
		scores[2] = tmp; 
		// 확인용 출력 
		System.out.println("user_name\t score");
		System.out.println("---------------------");
		for(int i = 0; i < scores.length; i++) {
			System.out.println(users[i] + "\t\t" + scores[i]);
		}
		
		//문제2-4. 점수가 높은 순으로 출력되는 게임 랭킹 보드를 만들어주세요. 
		//		랭킹 보드는 1위부터 5위까지 출력됩니다. 
		//		출력예) rank		user_name		score
		//				--------------------------------
		//				1.			꼬북이			96	
		//				2.			피카츄			87
		//				3.			라이츄			57
		//					....		
		// 정렬 : score 기준으로 내림차순(점수가 큰 순서대로) + 유저네임도 같이 자리교환 
		for(int i = 0; i < scores.length-1; i++) {
			for(int j = i+1; j < scores.length; j++) {
				if(scores[i] < scores[j]) {
					// 점수 자리 교환 
					int temp = scores[i]; 
					scores[i] = scores[j];
					scores[j] = temp; 
					// 유저네임도 같이 자리 교환 
					String sTemp = users[i]; 
					users[i] = users[j];
					users[j] = sTemp; 
				}
			}
		}
		// 순위대로 출력
		System.out.println("rank\t user_name\t score");
		System.out.println("-----------------------------");
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "\t" + users[i] + "\t\t" + scores[i]);
		}
		
		//문제2-5. 또 한명의 유저가 게임을 끝냈습니다. 점수와 유저네임을 입력받고, 
		//		기존 게임 랭킹보드를 업데이트하여 1~5위까지 출력해주세요. 
		//		이때 입력받은 새로운 유저의 데이터는 기존 데이터에 추가 되어야함(1-3 문제참고)
		//		업데이트 방법 : 1) 랭킹은 5위까지만 출력 
		//						2) 새로 입력받은 유저의 점수가 5위보다 낮으면 출력X 
		//							순위권 안에 들어노는 점수면 순위에 맞춰 출력 
		
		// 배열 방 크게 만들기 : 기존 배열 복사해두고 방크게만든 후 다시 옮겨담기 
		// 	기존 배열의 길이 따로 저장 
		int len = scores.length; 
		// 	기존 데이터 주소값 복사 해두기 
		int[] scoresTmp = scores; 
		String[] usersTmp = users; 
		//  6개 방으로 새로 할당 (기존 방보다 1개 더 크게 만들기) 
		scores = new int[len+1];
		users = new String[len+1]; 
		//  복사해둔 기존 데이터 옮겨 담기 
		for(int i = 0; i < len; i++) {
			scores[i] = scoresTmp[i]; 
			users[i] = usersTmp[i]; 
		}

		// 새 유저네임과 점수 입력받아 마지막 방에 저장 
		System.out.print("이름>>");
		users[len] = sc.nextLine(); 
		System.out.print("점수>>");
		scores[len] = Integer.parseInt(sc.nextLine());
		
		// 내림차순으로 정렬
		for(int i = 0; i < scores.length-1; i++) {
			for(int j = i+1; j < scores.length; j++) {
				if(scores[i] < scores[j]) {
					// 점수 자리 교환 
					int temp = scores[i]; 
					scores[i] = scores[j];
					scores[j] = temp; 
					// 유저네임도 같이 자리 교환 
					String sTemp = users[i]; 
					users[i] = users[j];
					users[j] = sTemp; 
				}
			}
		}
		
		// 1 ~ 5위 순위 출력 
		// 순위대로 출력
		System.out.println("rank\t user_name\t score");
		System.out.println("-----------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "\t" + users[i] + "\t\t" + scores[i]);
		}
		
		

		sc.close();
	}

}
