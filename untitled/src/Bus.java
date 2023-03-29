//버스는 자동차의 한 종류다
//확장하면 버스가 된다
public class Bus extends Car{
    //오버 라이딩
    public void run(){
        System.out.println("후륜 구동으로 달린다");
    }
    public void 안내방송(){
        System.out.println("안내방송하다");
    }
}
