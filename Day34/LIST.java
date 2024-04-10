import java.util.ArrayList;

public class LIST {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(5);
        // arr2.put(2) = 5;
        // arr2.add(2,5);
        System.out.println(arr2 +" "+arr2.size());
        arr2.add(1);
        arr2.add(10);
        arr2.add(2);
        arr2.add(5);
        arr2.add(2,5);
        System.out.println(arr2 +" "+arr2.size() + " "+arr2.contains(2));
        for(int i = 0 ;i<arr2.size();i++){
            System.out.println(arr2.get(i));
        }

        for(var e : arr2){
            System.out.println(e);
        }

        // System.out.println(arr+" " + arr.size());

    }
}
