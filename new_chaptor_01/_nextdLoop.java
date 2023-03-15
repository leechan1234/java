package new_chaptor_01;

public class _nextdLoop {
    public static void main(String[] args) {
        //이중 반복문

        // 별 (*) 사각형 만들기
        /*

         *****
         *****
         *****
         *****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        //별 (*) 왼쪽 삼각형 만들기
        /*

         *
         **
         ***
         ****
         *****

         * */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("00-------------------");
        /*
         *****
         ****
         ***
         **
         *
         */

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        
        /*
             *
            **
           ***
          ****
         *****
           ssss*
           sss**
           ss***
           s****
           *****

        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //구구단

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int sum = i * j;
                System.out.println(i + "x" + j + "=" + sum);
            }
        }
    }
}

