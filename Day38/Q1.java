package Day38;

import java.util.*;

/*
 * given an integer arr , return an array of size 3 which wil be containing
 * top 3 smallest element from this array
 */

public class Q1 {
    //TC : O(nlogn)
    int [] samllest3(int arr[]){
        Arrays.sort(arr);
        int ans[] = new int[3];
        for(int i = 0;i<3;i++)ans[i] = arr[i];
        return ans;
    }

    //TC : O(n)
    int [] samllest3_2(int arr[]){
        PriorityQueue<Integer>pq = new PriorityQueue<>((x,y) -> y-x);

        int ans[] = new int[3];
        for(int i = 0;i<arr.length;i++){
            if(pq.size() < 3){
                pq.add(arr[i]);
            }else{
                if(pq.peek()  > arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                } 
            }
        }

        Iterator<Integer> it = pq.iterator();
        int i = 0;
        while(it.hasNext()){
            ans[i] = it.next();
            i++;
        }
        return ans;

    }

}
