package chaptor_06.Sacple;

 class animal{
  String name;

     public void setName(String name) {
         this.name = name;
     }
 }



public class Java {
    public static void main(String[] args) {
animal dog = new animal();
dog.setName("happy");
        System.out.println(dog.name);
    }
}
