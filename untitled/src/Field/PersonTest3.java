package Field;

public class PersonTest3 {
    static int i;
    static {
        i = 500;
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.name = "홍길동";
 p1.printCount();
        p1.printName(); // 작동은 되지만 올바르지 않다

        Person.printCount();


    }
}
