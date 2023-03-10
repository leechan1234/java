package Chaptor_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List1 {
    public static void main(String[] args) {
        ArrayList<String> a =new ArrayList<>(Arrays.asList("1","3","5","4","2"));
        a.sort(Comparator.reverseOrder());
        System.out.println(a);

    }
}
