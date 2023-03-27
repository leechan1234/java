package Field;
//필드
public class Person {
   String name ;
    String address;
    boolean isVip;

static  int count = 0;
static {
        count = 100;
    }

public  void printName(){
    System.out.println("내 이름은 " + name);
}
public static void printCount(){
    System.out.println("count :" + count);
//    System.out.println(name);

    //클래스 메소드 안에서 인스턴스 변수를 사용 못하는 이유 : 생성되는 시점의 메모리가 다르기 때문 인스턴스필드는 그 인스턴스를
    //참조하는 변수를 이용하지만 클래스 메소드는 인스턴스 없이 사용가능하다.
    //따라서 클래스가메소드가 실행될때 인스턴스필드의 메모리가 없기 때문에 컴파일 오류가 나기 때문

}

}




