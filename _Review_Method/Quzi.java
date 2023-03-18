package _Review_Method;

public class Quzi {
    public static String HiddenData(String name, int index) {
        String hidata = name.substring(0, index);
        for (int i = 0; i < name.length() - index; i++) {
            hidata += "*";
        }
        return hidata;
    }

    public static void main(String[] args) {
        String name = "나코딩"; //나**
        String number = "990130-1234567"; //990130-1******
        String phnumber = "010-1234-5678"; //010-1234-****

        System.out.println(HiddenData(name, 1));
        System.out.println(HiddenData(number, 8));
        System.out.println(HiddenData(phnumber, 9));

    }
}
