package Day6;

import java.util.Scanner;

/*
 * take number i/p from the user and gonna print a star patter
 * | *
 * | * *
 * | * * *
 * | * * * *
 */
public class Q3 {
    public static void main(String[] args) {
        // System.out.print();
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(r <= 0)return;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
