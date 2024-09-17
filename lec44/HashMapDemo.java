package lec44;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <String,Integer> hashMap = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        String key = sc.nextLine();
//        int val = sc.nextInt();
//        hashMap.put(key,val);

        hashMap.put("Apple",5);
        hashMap.put("Cherry",20);
        hashMap.put(null,50);
        hashMap.put("Orange",null);
        hashMap.put(null,null);

        System.out.println(hashMap);

        for(String key : hashMap.keySet())
        {
            System.out.println(hashMap.get(key));
        }

        LinkedHashMap <String,Integer> hashMap2 = new LinkedHashMap<>();
        //null values and keys are also allowed here
        hashMap2.put("Banana",10);
        hashMap2.put("Apple",5);
        hashMap2.put("Cherry",20);

        System.out.println(hashMap2);

        Hashtable <Integer,String> hashtable = new Hashtable<>();
        //null keys and values are not allowed
        hashtable.put(10,"Banana");
        hashtable.put(5,"Apple");
        hashtable.put(20,"Cherry");

        System.out.println(hashtable);

        TreeMap <Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10,"Banana");
        treeMap.put(5,"Apple");
        treeMap.put(20,"Cherry");

        System.out.println(treeMap);

        TreeMap <Integer,String> treeMap1 = new TreeMap<>(Comparator.reverseOrder());
        treeMap1.put(10,"Banana");
        treeMap1.put(5,"Apple");
        treeMap1.put(20,"Cherry");

        System.out.println(treeMap1);


    }
}
