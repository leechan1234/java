package if_Test;

public class _04_If {
    public static void main(String[] args) {
        int math = 90;
        int eng = 90;
        int lam = 90;
        if (math > 50){
            if (eng > 50){
                if (lam>80){
                    System.out.println("합격");
                }else {
                    System.out.println("불합격");
                }
            }
        }
    }
}
