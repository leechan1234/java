package _01_Practice;

class Math {
  void gugudan(int dan){
      if (!(dan >= 2 && dan <=9))
            return;

          for (int i = 1; i <=9 ; i++) {
              System.out.printf("%d * %d = %d%n",dan,i,dan * i);

      }

 }
}

public class AAA {
    public static void main(String[] args) {
        Math m =new Math();
        m.gugudan(3);



    }
}
