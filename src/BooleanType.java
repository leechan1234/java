package src;

public class BooleanType {
    public static void main(String[] args) {
     String name ="나도코딩";
     int hour = 15;
        System.out.println(name +"님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name +"님 배송이 완료되었습니다");
        name="강백호";
        double score = 90.5;
        char hak= 'A';
        System.out.println(name +"님의 평균 점수는 " + score + "점 입니다.");
       boolean text = true;
        System.out.println("이번 시험에 합격 했을까요? " + text);

        long a = 1_000_000_000_000L;
        System.out.println(a);
    }
}
