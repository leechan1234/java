package Quiz_01;

public class Quiz_03 {
    public static void main(String[] args) {
        String Number = "901231-1234567";
        String Number1= "990422-1234567";
        System.out.println(Number.substring(0,8));
        System.out.println(Number.substring(0,Number1.indexOf("-") + 2));
    }
}
