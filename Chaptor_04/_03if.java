package Chaptor_04;

import java.util.ArrayList;
import java.util.Arrays;

public class _03if {
    public static void main(String[] args) {
        int month = 2;
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "1월이라니까";

                break;
            case 2:
                monthString = "2월이라니까";

                break;
            case 3:
                monthString = "3월이라니까";

                break;
            default:
                break;


        }
        System.out.println(monthString);

    }
}
