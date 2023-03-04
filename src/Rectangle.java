package src;

public class Rectangle {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {

            i = i + 1;
            int j =1;
            while (j < 10) {

                System.out.print("*");
                j = j + 1;
            }
            System.out.println("*");
        }
    }
}