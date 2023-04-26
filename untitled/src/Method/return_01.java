package Method;

class Return {
    String getName() {
        return "홍길동";
    }

    int getAge() {
        return 30;
    }
}

public class return_01 {
    public static void main(String[] args) {
        Return obj = new Return();

        String name = obj.getName();
        System.out.println(name);
        int age = obj.getAge();
        System.out.println(age);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
}
