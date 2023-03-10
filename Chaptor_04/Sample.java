package Chaptor_04;

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("people","사람");
        map.put("baseball","야구");
        System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
        System.out.println(map.getOrDefault("food","음식"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));
        System.out.println(map.getOrDefault("people","사람"));
        System.out.println(map.size());
        System.out.println(map.keySet());
    }
}
