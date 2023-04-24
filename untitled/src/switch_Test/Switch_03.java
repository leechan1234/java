package switch_Test;

public class Switch_03 {
    public static void main(String[] args) {
         String add = "서울";
         switch (add){
             case "서울" :
                 System.out.println("서울입니다");
                 break;
             case "부산":
                     System.out.println("부산입니다");
                     break;
             case "제주" :
                 System.out.println("제주 입니다");
                 break;
             default:
         }
        System.out.println("저희 집은" + add + "입니다");
    }
}
