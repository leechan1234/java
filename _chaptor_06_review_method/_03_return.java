package _chaptor_06_review_method;

public class _03_return {
    //호텔 전화번호
    public static String gerPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    //호텔 주소
   public static String GetAdress(){
        return  "서울 어딘가";

   }
   //호텔 액티비티
    public static String activite (){
        return "탁구,농구,노래방";
    }

    public static void main(String[] args) {
        String contactNumber = gerPhoneNumber();
        System.out.println("호텔 전화번호는 :" + contactNumber);
        String adresses = GetAdress();
        System.out.println("호털 주소는 :" + adresses);
        String Activies = activite();
        System.out.println("호텔 활동거리는:" + Activies );
    }
}
