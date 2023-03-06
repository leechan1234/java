package Chaptor_04;

public class _elseif03 {
    public static void main(String[] args) {
        //조건은 elseif
        //한라봉 에이드가 있으면 +1
        //망고주스가 있으면 +1
        // 아이스 아아메+1

        boolean hallabongaAde = false; // 한라봉
        boolean mangoJuice = false; // 망고

        if (hallabongaAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else{
            System.out.println("아아메 +1");
        }
        System.out.println("커피 주문완료 #1");
    }
}
