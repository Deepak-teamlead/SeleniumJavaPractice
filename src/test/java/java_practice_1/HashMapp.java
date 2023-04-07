package java_practice_1;
import java.util.HashMap;
public class HashMapp {
    public static void main(String[] args) {
        // Hasshmap
        HashMap h=new HashMap();
        h.put("raja","kaja");
        h.put(100,"snake");
        h.put(101,"brock");
        h.put(10.2,"cake");
        h.put(true,"rock");
        System.out.println("elements in hashmap : "+h);  // insertion order is not maintained
        System.out.println("to get value by giving key : "+h.get("raja"));   //o/p- kaja
        System.out.println("to remove value by giving key : "+h.remove(100));  //o/p: snake
        System.out.println("elements in hashmap after removal : "+h);  // 100=snake is removed from hashmap

    }
}
