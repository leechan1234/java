package _chaptor_06_review_method;

public class _05_OverLoading {
    public static int getPower(int number) { //
        int result = number * number;
        return result;
        //retutn number * numebr 위와 같은 문법
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent ) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 번 선언
        // 전달값의 타입(int number),전달값의 갯수가 다를때(int number, int exponent )
        // 반환값 중복 x
        System.out.println(getPower(3)); // 3 * 3 =9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3,3));
    }
}

//전달값의 타입,지료형이 다르거나,전달값의 갯수가 다를때 메소드 오버로딩이 가능
