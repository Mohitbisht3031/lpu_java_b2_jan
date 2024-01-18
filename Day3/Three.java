package Day3;
import java.util.Scanner;

/**
 * Three
 */

// write a program to take an integer value as an input and check if that value will
// be equalted as a character between A-Z || a-z
public class Three {

    public static void main(String[] args) {
        // int a = 10;
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        char ch = (char)a;
        sc.close();
        System.out.println("the value corressponding to the given number is " + ch);
        // long l = 21474836498927L;
        // a = (int)l;
        // System.out.println("the value of l is " + a);
    }
    
}