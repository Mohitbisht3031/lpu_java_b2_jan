package Day27;

/*
 * given an integer array nums, you are supposed to make an ans array of same len
 * such that the ith index is the product of all the elements except self , wihtout
 * using divide operator 
 */

class OC{
    static class NC{
        int c = 0;
        void inc(){
            c++;
        }
    }

    public static void main(String[] args) {
        OC obj = new OC();
        obj.NC.inc();
        // OC.NC ob2 = obj.new NC();
        // ob2.inc();
    }

}

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

    // TC :O(n) , SC : O(n)
    int[] prod2(int arr[]){
        int ans[] = new int[arr.length];
        int suf[] = new int[arr.length];
        int p = 1;
        suf[suf.length-1] = p;
        for(int i = arr.length-2;i>=0;i--){
            suf[i] = p*arr[i+1];
        }
        p = 1;
        for(int i = 0;i<arr.length;i++){
            ans[i] = p*suf[i];
            p*=arr[i];
        }
        return ans;
    }

    // TC : O(n), SC:O(1)
    int[] prod3(int arr[]){
        int ans[] =new int[arr.length];
        int p = 1;
        for(int i = 0;i<arr.length;i++){
            ans[i] = p;
            p*=arr[i];
        }
        p =1;
        for(int i =arr.length-1;i>=0;i--){
            ans[i]*=p;
            p*=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        OC obj = new OC();

    }

}