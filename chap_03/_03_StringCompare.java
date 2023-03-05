package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true 아니면 false
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화 Java 에서는 equals를 적극 권장
         s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
         s2 = "1234";
        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234");//new String을 사용 하게 되면 내용들을 각각 전달해준다
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false
    }
}
