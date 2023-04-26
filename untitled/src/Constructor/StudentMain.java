package Constructor;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("홍길동");
        Student s2 = new Student("홍길동", 24);
        Student s3 = new Student("홍길동", 25, " 소프트");


        System.out.println(s3.name);
        System.out.println(s3.department);
        System.out.println(s3.grade);
    }
}
