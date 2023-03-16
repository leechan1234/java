package _chaptor_06_review_method;



public class _01_method_ {
    public static void sayHello() {
        System.out.println("안녕하세요 메소드 입니다");
    }

    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
