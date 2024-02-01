/*
 * Make the array
 * print if there is any duplicate element or not
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    // approach 1
    boolean haveDup(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j])return true;
            }
        }

        return false;
    }

    // approach 2
    boolean haveDup2(int arr[]){
        Arrays.sort(arr);

        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1])return true;
        }

        return false;
    }

    public static void main(String[] args) {
    //   int arr[] = new int[5];
    // //   for(int i = 0;i<arr.length;i++)System.out.print(arr[i]+" ");
    //   for(var e : arr)System.out.print(e+" ");
    // //   System.out.println(arr); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++)arr[i] = sc.nextInt();

        Q1 obj = new Q1();
        if(obj.haveDup(arr)){
            System.out.println("given array is having a duplicate val");
        }else System.out.println("given array is unique!!");

        sc.close();
    }
}
