package Day17;

import java.util.Arrays;

/*
 * Given an int array consisting of duplicates
 * print the majority element
 * element occuring more then equal to n/2 number of times is a majority element
 */
public class Q1 {
    
    // brute force apporach TC O(n^2)
    void majority(int arr[]){
        int n = -1;
        for(int i = 0;i<arr.length;i++){
            int c = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j])c++;
            }
            if(c >= (arr.length-1)/2){
                n = arr[i];
                break;
            }
        }
        System.out.println(n);
    }

    // Sorting TC:O(nlogn) 
    void majority2(int arr[]){
        Arrays.sort(arr);
        int mid = (arr.length-1)/2;
        System.out.println(arr[mid]);
    }

    // frequency, TC:O(n), SC:O(n)
    void majority3(int arr[]){
        int freq[] = new int[100000001];
        for(int v : arr)freq[v]++;
        int n = -1;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] >= (arr.length-1)/2){
                n = i;
                break;
            }
        }
        System.out.println(n);
    }

    // TC : O(n) , SC:O(1)
    void majority4(int arr[]){
        int c = 1;
        int n = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == n)c++;
            else c--;

            if(c == 0){
                n = arr[i];
                c = 1;
            }
        }
        System.out.println(n);
    }

   public static void main(String[] args) {
    
   } 
}
