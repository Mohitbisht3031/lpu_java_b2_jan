package Day41;

/*
 * given an integer n , ur suppose to tell nth tribonachi num
 * a tribonachi number is sum of last 3 numbers
 */

public class Q2 {
    int tribonachi(int n){
        if(n <= 2)return (n == 0 ? 0 : 1);
        int a1 = tribonachi(n-1);
        int a2 = tribonachi(n-2);
        int a3 = tribonachi(n-3);
        return a1+a2+a3; 
    }

    int tribonachi_2(int n){
        if(n <= 2)return (n == 0 ? 0 : 1);
        int ans[] = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 1;
        for(int i = 3;i<=n;i++){
            ans[i] = ans[i-1]+ans[i-2]+ans[i-3];
        }
        return ans[n];
    }

}
