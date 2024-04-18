package Day37;

import java.util.*;

public class MAP {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("Yash",10);
        mp.put("Mohit", 13);
        mp.put("Aditya", 13);
        mp.put("Mohit" , 25);
        System.out.println(mp);
        // to print any specific key
        System.out.println(mp.get("Aditya"));

        // to get set of keys
        System.out.println(mp.keySet());

        System.out.println(mp.remove("Mohit"));
        System.out.println(mp +" "+mp.size() +" "+mp.isEmpty());

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }

        Iterator<Map.Entry<String,Integer>> it = mp.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String,Integer> e = it.next();
            System.out.println(e.getKey()+"->"+e.getValue());
        }

    }
}