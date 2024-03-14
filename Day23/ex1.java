package Day23;

/*
 * given an integer n , find a pivot x such that the sum from 1tox and from x to n is 
 * equal. return that pivot number if no such number return -1
 */
public class ex1 {
    // brute force , TC:(n^2) , O(1)
    int pivotInd(int n){
        int s = 0;
        for(int i = 1;i<=n;i++){
            s+=i;
            int sum = 0;
            for(int j = i;j<=n;j++){
                sum+=j;
            }
            if(s == sum)return i;
        }
        return -1;
    }

    // TC:O(n) , O(1)
    int pivotInd2(int n){
        int ts = (n*(n+1))/2;

        int s = 0;
        for(int i = 1;i<n;i++){
            s+=i;
            if((ts-s)+i == s)return i;
        }

        return -1;
    }

    // 

}
