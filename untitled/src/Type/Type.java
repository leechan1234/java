package Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Type {
    public static void main(String[] args) {
        //리스트는 배열과 비슷한 자료형 배열보다 편리한 기능 가지고 있음
        //차이점 : 배열은 길이가 정해져 있지만 리스트는 없고 동적으로 변한다
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("123", "230", "200"));
       pitches.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(pitches);
    }
}
