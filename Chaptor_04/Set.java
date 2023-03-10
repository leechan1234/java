package Chaptor_04;

import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
HashSet<Integer> s1 =new HashSet<>(Arrays.asList(1,2,3,4,5,6));
HashSet<Integer> s2 =new HashSet<>(Arrays.asList(4,5,6,7,8,9));
HashSet<Integer> union = new HashSet<>(s1);
union.addAll(s2);
        System.out.println(union);

        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);
    }
}
