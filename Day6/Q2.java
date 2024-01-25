package Day6;

import java.util.Scanner;

/*
 * take i/p of a num from the user and print it's table as a o/p
 */
 
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 3;
        while(c-- > 0 && n <= 1){
            System.out.println("enter a valid number");
            n = sc.nextInt();
            if(n > 1)break;
            else if(c == 0 && n <= 1)return;
        }
        // if(n <= 1)System.out.println("Please enter a number greater then 1");
        // else{
            for(int i = 1;i<=10;i++){
                System.out.println(n+" x "+i+" = "+(n*i));
            }
        // }
        sc.close();
    }
}
