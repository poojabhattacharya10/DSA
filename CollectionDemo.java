package Hashmap;
import java.util.HashMap;
import java.util.Map;

public class CollectionDemo {
    public static void main(String[] args) {
        // What is Map in Java?
        Map<String,Integer> map;
        map = new HashMap<String,Integer>();
        map.put("shyam",2222);
        map.put("ram",3333);
        System.out.println(map.get("shyam"));
        System.out.println(map.get("ram"));
    }
}
