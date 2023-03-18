package _Review_Method;

public class _review_Return {
    public static String getphone() {
        String gphone = "123456";
        return gphone;

    }

    public static String adress() {
        return "서울시 어딘가";
    }

    public static String activites() {
        return "축구장,농구장,탁구장";
    }

    public static void main(String[] args) {
        System.out.println(getphone());
        System.out.println(adress());
        System.out.println(activites());
    }
}

