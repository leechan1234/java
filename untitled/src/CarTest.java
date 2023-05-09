
class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white" , "auto" , 4);
    }
    Car(String color){
        this(color , "auto" ,4);
    }

    Car(String color, String gearType, int door ){
        this.color = color;
      this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest {
    public static void main(String[] args) {
     Car c1 = new Car("blue");
     Car c2 =new Car();
        System.out.println(c1.color + c1.gearType );
        System.out.println(c2.color);

    }
}
