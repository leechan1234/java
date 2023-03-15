package new_chaptor_01;

public class _Array_Loop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffee = {"커피", "모카", "아바라", "바닐라라떼"};
        System.out.println(coffee[0] + "하나");  //일일이 하나씩 출력해야하는 상황이라 배열의 이점이 없는 상황

        // 인덱스 값을 처리해야 하는 일을 할때는 fori를 사용 ex) 0~10 있는데 0 1 2 3만 적용
        for (int i = 0; i < coffee.length; i++) {
            System.out.println(coffee[i] + "하나");
        }
        System.out.println("---------------------------");
        //or
        for (int i = 0; i < 4; i++) {
            System.out.println(coffee[i] + "하나주세요");
        }
        System.out.println("------------------------");
        // for each : 모든 배열을 순회하고 싶을때 사용
        for (String coffees: coffee) {
            System.out.println(coffees+ "gksk");

        }

    }
}
