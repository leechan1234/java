package _Class_Oop_Practice01;

public class Card_Object {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height =" + Card.height);
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        System.out.println("c1은" + c1.kind + "," + c1.number + " 이며" + "크기는" + "(" + Card.width + "," + Card.height + ")");
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c2 는" + c2.kind + "," + c2.number + "이며," + "크기는" + "(" + Card.width + "," + Card.height + ")");
        c1.width = 50;
        c1.height = 80;
        System.out.println("c1 의 width 와 height를 각각 " + "(" + Card.width + "," + Card.height + ") 으로 변경 합니다.");
        System.out.println("c1은" + c1.kind + "," + c1.number + " 이며" + "크기는" + "(" + c2.width + "," + c2.height + ")");//Card.width 쓰도록 권장
        System.out.println("c2은" + c2.kind + "," + c2.number + " 이며" + "크기는" + "(" + Card.width + "," + Card.height + ")");


    }
}
