package Day26;

/*
 * given an integer array nums, you are supposed to make an ans array of same len
 * such that the ith index is the product of all the elements except self , wihtout
 * using divide operator 
 */
public class Q1 {
    // TC : O(n^2) , SC : O(1)
    int[] prod(int arr[]){
        int ans[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            int p = 1;
            for(int j = 0;j<arr.length;j++){
                if(i == j)continue;
                p*=arr[j];
            }
            ans[i] = p;
        }
        return ans;
    }
}
