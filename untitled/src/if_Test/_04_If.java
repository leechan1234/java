package if_Test;

public class _04_If {
    public static void main(String[] args) {
        int math = 90;
        int eng = 90;

//        if (math >= 60){
//            if (eng >= 60){
//                System.out.println("통과");
//            }
//        }else {
//            System.out.println("탈락");
//        }
        //위에 것을 한 줄로
        if (math >= 50 && eng >=50){
            System.out.println("합격");
        }else {
            System.out.println("불합격");
        }
    }
}
