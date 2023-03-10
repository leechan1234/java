package Chaptor_04;

import java.util.HashMap;

public class mapProblum {
    public static void main(String[] args) {
        HashMap<String,Integer> grade = new HashMap<>();
        grade.put("A",90);
        grade.put("B", 80);
        grade.put("C",70);
        System.out.println(grade.remove("B"));
        System.out.println(grade.keySet());
    }
}
