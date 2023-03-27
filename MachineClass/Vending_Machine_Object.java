package MachineClass;
// 기본 생성자는 생성자가 없을 경우 컴파일할 때 자동으로 생성된다.
public class Vending_Machine_Object {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
   String product =vm.pushProductButton(2);
        System.out.println(product);
      String product2= vm2.pushProductButton(200);
        System.out.println(product2);








    }
}
