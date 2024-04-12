package Day35;

import java.util.*;

public class SET {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Set<Integer> ts = new TreeSet<>();
        Set<Integer> lhs = new LinkedHashSet<>(); 
        hs.add(1);
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(3);

        System.out.println(hs+" "+hs.size() +" "+hs.contains(4) + " "+hs.isEmpty());
        hs.clear();
        for(var e : hs)System.out.println(e);
        System.out.println(        );

        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
