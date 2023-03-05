package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int cm = 121;
        int y  = 115;
         String possible = (cm >= y) ? "탑승 가능" : "탑승 불가능";

        System.out.println("키가 121cm 이므로 " + possible + "합니다.");
        String impossible =  (cm <= y) ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가 115cm 이므로 " + impossible + "합니다.");
    }
}
