package for_Test;

public class for_for_01 {
    public static void main(String[] args) {
        for (int i = 2; i <=9 ; i++) {
            System.out.println("["+i+"]단");
            for (int j = 1; j <= 9; j++) {
                int result;
                result = i * j;
                System.out.println(i+ "x" + j + "=" + result);
            }
        }
    }
}
