package Method;
class Return2 {
 void getTest(int type){
     System.out.println("getTest() 메서드 시작");

     if (type == 1){
         return;
     }
     System.out.println("getTest() 메서드 끝");
 }
  String getName(int type){
     if(type == 1){
         return"";
     }
     return "홍길동";
  }
}
public class ReturnEx2 {
    public static void main(String[] args) {
        Return2 r = new Return2();
        r.getTest(0);
        r.getTest(1);
        System.out.println(r.getName(0));
        System.out.println(r.getName(1));
    }
}
