package chap_03;

public class _String01_ {
    public static void main(String[] args) {
        String s = "I like Java and Python and c.";
        System.out.println(s);

        //문자열 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로

        System.out.println(s.toLowerCase());

        //포함관계
        System.out.println(s.contains("Java")); //포함 된다면 true  포함되지않
        //으면 false
        System.out.println(s.contains("c#")); //false

        System.out.println(s.indexOf("Java")); // 위치정보
        System.out.println(s.indexOf("c#")); //포함되지 않는다면 -1

        System.out.println(s.indexOf("and")); // 처음 만나는 위치정보
        System.out.println(s.lastIndexOf("and")); //마지막으로 만나는 위치정보

        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith("."));// 이 문자열로 끝나면 true
    }
}
