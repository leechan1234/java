package src;

public class StringExample {
    public static void main(String[] args) {
        String me = "살은 내가 쪄요";
       String replaced = me.replaceAll("내가","치킨이");
        System.out.println(replaced);
    }
}