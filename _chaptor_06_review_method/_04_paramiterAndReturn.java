package _chaptor_06_review_method;

public class _04_paramiterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        //retutn number * numebr 위와 같은 문법
    }


    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
      return result;
    }
        public static void main (String[]args){
            int retval = getPower(2);
            System.out.println(retval); // 2 * 2 = 4

            retval = getPower(3);
            System.out.println(retval); // 3 * 3 = 9

            retval = getPowerByExp(3,3); // 3 * 3 * 3 = 27
            System.out.println(getPowerByExp(2,4));
        }
    }

