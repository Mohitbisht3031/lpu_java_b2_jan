package Day6;

import java.util.Scanner;

/*thake i/p of a number from the user and then we are supposed to print fibb seq till that number
 * 2 -> 1 1
 * 3 -> 1 1 2 
 * 4 -> 1 1 2 3
 * <=0 ->
*/

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number of numbers u want to see of seq:");
        int i = sc.nextInt();
        if(i <= 0)System.out.println("Give a valid input!!");
        else{
            int a = 1;
            int b = 1;
            if(i == 1)System.out.println(a);
            else if(i == 2){
                System.out.println(a);
                System.out.println(b);
            }else{
                for(int j = 1;j<=i;j++){
                    if(j<=2)System.out.println(a);
                    else{
                        System.out.println(a+b);
                        int t = a;
                        a = b;
                        b = a+t;
                    }
                }
            }
        }
        sc.close();
    }
}
