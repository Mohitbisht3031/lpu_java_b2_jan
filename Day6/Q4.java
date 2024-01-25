package Day6;

import java.util.Scanner;

/*
 *       *
 *      **
 *     ***
 *    ****
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(r <= 0)return;
        for(int i = 0;i<r;i++){
            for(int j = 2*(r-i);j>=0;j--)System.out.print(" ");
            for(int j = 0;j<=i;j++)System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
