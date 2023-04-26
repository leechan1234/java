package Constructor;

public class Student {
    String name;
    int grade;
    String department;

//    Student(String n, int g, String d){
//        name = n;
//        grade = g;
//        department = d;
//    }
    //기본생성자
    Student(){

    }
    Student(String n){
        name = n;
    }
    Student(String n , int g){
        name = n;
        grade = g;
    }
    Student(String n , int g , String d){
        name = n;
        grade = g;
        department =d;
    }
}
