package practice;

public class Practice {
    public static void main(String[] args) {
        //6세이상 탑승가능 (단 ,키가 120cm이상이면 보호자 동반하에 탑승 가능)

        //키 120cm 이상 탑승 가능

        // 심장관련 질환자 탑승 불가
        //나이 변수는 age 키는 height 보호자 동반여부 parent 심장질환여부는 hearchDease
        int age = 6;
        boolean parent = true;
        int height = 120;
        boolean hearchDease = false;
//
        System.out.println((age >= 6 && height >= 120) || (height >= 120 && parent == true) && hearchDease == false );


    }
}
