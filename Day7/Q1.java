package Day7;

import java.util.Scanner;

/*
 * make array
 * cal the avg of the array and print it
 */

public class Q1 {
    int avg(int arr[]){
        int s = 0;
        for(int i = 0;i<arr.length;i++)s+=arr[i];
        return (s/arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)arr[i] = sc.nextInt();

        Q1 obj = new Q1();
        System.out.println("The avergae of the given input is "+obj.avg(arr));
        sc.close();
    }
}
