package _Review_Method;

import java.util.Arrays;

public class _return {

    public static String[] hello() {
        String[] members = {"최진혁", "최유빈", "임정은"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = hello();

        System.out.println(Arrays.toString(members));
        System.out.println(Arrays.toString(members));

    }
}
