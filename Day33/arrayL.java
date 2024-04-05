package Day33;

import java.util.ArrayList;

public class arrayL {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(5);
        // arr2.add(2,8);
        arr.add(5);
        System.out.println("arr1"+arr);
        System.out.println("arr2"+arr2);
        System.out.println("size of arr1 & arr2 "+arr.size() +","+arr2.size());
    }
}
