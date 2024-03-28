package practice_project.assisted_practice1;

import java.util.*;

public class P06 {

    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);
        hashMap.put("Charlie", 40);
        System.out.println("HashMap: " + hashMap);

        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 100);
        treeMap.put("Lion", 150);
        treeMap.put("Elephant", 200);
        System.out.println("TreeMap: " + treeMap);

        // LinkedHashMap example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 5);
        linkedHashMap.put("Banana", 10);
        linkedHashMap.put("Orange", 8);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
