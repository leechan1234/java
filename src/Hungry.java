package src;

public class Hungry {
    public static void main(String[] args) {
        int money= 6500;

        if (money >= 8000){
            System.out.println("순대국 꿀맛");
        } else if (money >= 5000) {
            System.out.println("스테이크 꿀맛");
        } else{
            System.out.println("굶으셈");
        }
    }
}
