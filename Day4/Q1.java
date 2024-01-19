package Day4;
/*take i/p from the user and ell if it's odd or even*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = ((a&1) == 1 ? "odd" : "even");
        System.out.println("The given number is "+ans);
        sc.close();
    }
}
