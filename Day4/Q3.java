package Day4;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        /*if(a < 0){
            System.out.println("The given number is negative");
        }else if(a == 0) {
            System.out.println("the given number is 0");
        }else{
            System.out.println("the given number is +ve");
        }*/
        //Switch case

        switch (a) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("the number is 1");
                break;
            default:
                System.out.println("number is not 0");
        }

        sc.close();
    }
}
