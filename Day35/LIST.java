package Day35;

import java.util.*;

public class LIST {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>(5);
        arr2.add(1);
        arr2.add(1);
        arr2.add(1);
        arr2.add(1);
        arr2.add(1);
        arr2.add(1); //arr2.add(2,5)
        arr2.add(2,5);
        System.out.println(arr2+" "+arr2.size()+" "+arr2.contains(5) + " " + arr2.isEmpty() +" "+arr1.isEmpty());

        for(int i = 0;i<arr2.size();i++)System.out.println(arr2.get(i));
        System.out.println();
        for(var e : arr2)System.out.println(e);
        System.out.println();
        Iterator<Integer> it = arr2.iterator();
        // hasNext() , next()
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
