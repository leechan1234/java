package new_chaptor_01;

public class _Quiz_06 {
    public static void main(String[] args) {

        //신발 사이즈는 250 부터 295까지 5단위로 증가
        //신발 사이즈는 총 10가지
        //구매 가능한 신발 사이즈 옵션
        int[] shoose = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
        for (int shooses : shoose) {
            System.out.println("사이즈" + shooses + "(재고있음)");
        }
        System.out.println("-------------------");
        // 다른 풀이
        int[] shooseSize = new int[10];
        for (int i = 0; i <shooseSize.length ; i++) {
            shooseSize[i] = 250 + (5 * i);
        }
        for (int shooses : shoose) {
            System.out.println("사이즈" + shooses + "(재고있음)");
        }
    }
}
