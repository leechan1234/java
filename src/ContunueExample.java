package src;

public class ContunueExample {
    public static void main(String[] args) {
        for (int i= 0; i<10; i=i+1) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
