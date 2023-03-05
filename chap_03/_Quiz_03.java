package chap_03;

// "901231-1234567" 인 경우 901231-1
// "030708-4567890" 인 경우 030708-4
public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567"; //주민등록 번호 13자리
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2));
}



}
