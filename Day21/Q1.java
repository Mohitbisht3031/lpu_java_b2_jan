package Day21;

import java.util.Arrays;

/*
 * given an array of in type (can consist of duplicates and is of even lenght)
 * we are suppose to tell if we can divide the arry into 2 arry of equal len or not
 * both the arry shld have unique elements wrt themselves
 */

public class Q1 {
    // brute force approach , TC:O(n^2)
    boolean check(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int c = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j])c++;
            }
            if(c >= 3)return false;
        }
        return true;
    }

    // optimized ,tc : O(nlogn)
    boolean check2(int arr[]){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-2;i++){
            if(arr[i] == arr[i+2])return false;
        }
        return true;
    }

    //TC : O(n) , O(n);
    boolean check3(int arr[]){
        int freq[] = new int[100000001];
        for(var e : arr)freq[e]++;
        for(var e : freq){
            if(e >= 3)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
