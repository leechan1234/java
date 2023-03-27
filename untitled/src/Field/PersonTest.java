package Field;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홀길동 ";
        p2.name = "조조";
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);



    }

}
