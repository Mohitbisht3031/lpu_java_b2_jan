/*
 * given an int array of size 'n' , where all the elements are ranging from [1,n]
 * now by some error 1 element got repeated and another got erased , print the element
 * got erased and element got repeated
 * 
 * tc1 : [1,2,4,2] -> o/p : 2,3
 *       [1,2,2,3] -> 3
 *        0,1,2,3
 */

public class Q2 {
    // approach 1
    // tc : O(n^2)
    void repeatedMissing(int arr[]){
        int r = 0;
        int m = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    r = arr[i];
                    break;
                }
            }
            if(r != 0)break;
        }

        for(int i = 1;i<=arr.length;i++){
            boolean f = false;
            for(int j = 0;j<arr.length;j++){
                if(arr[j] == i){
                    f = true;
                    break;
                }
            }
            if(!f){
                m = i;
            }
        }
        System.out.println("erased value is "+m+" repeated val is "+r);
    }

    void repeatedMissing2(int arr[]){
        int freq[] = new int[arr.length+1];
        int r = 0;
        for(int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
            if(freq[arr[i]] == 2)r = arr[i];
        }

        int m = 0;
        for(int i = 1;i<freq.length;i++){
            if(freq[i] == 0){
                m = i;
                break;
            }
        }

        System.out.println("erased value is "+m+" repeated val is "+r);
    }    

    public static void main(String[] args) {
        
    }   
}
