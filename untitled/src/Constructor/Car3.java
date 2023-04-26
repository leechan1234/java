package Constructor;

public class Car3 {
    String color;
    String company;
    String type;

    Car3(){
        this("white","기아","경차");
    }
    Car3(String color, String company , String type){
        this.color =color;
        this.company=company;
        this.type=type;
    }
    Car3(String com, String t){
        this("white", com, t);
    }
    Car3(String t){
        this("white","기아",t);
    }

    public String toString(){
        return color+company+type;
    }
}
