/*
 * given an int array consist of +ve an -ve int , same freq of both the elements
 * i.e length of the array will be even
 * modify the array acording to the rules
 * 1. All the elments will be of alternative sign
 * 2. It wil start from +ve number
 *  3. relative order of the elements will be mentained
*/

public class Q1 {
    void alternative(int nums[]){
        int nNums[] = new int[nums.length];
        int p =1;
        int pi = 0;
        int ni = 0;
        for(int i = 0;i<nums.length;i++){
            if(p == 1){
                for(int j = pi;j<nums.length;j++){
                    if(nums[j] > 0){nNums[i] = nums[j];
                    pi = j;
                    break;} 
                }
                p = 0;
            }else{
                for(int j = ni;j<nums.length;j++){
                    if(nums[j] < 0){nNums[i] = nums[j];
                    pi = j;
                    break;} 
                }
                p= 1;
            }
        }
        for(int e : nNums)System.out.print(e+" ");
    }
    public static void main(String[] args) {
        
    }   
}
