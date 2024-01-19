package Day4;
/*Write a program to calculate the BMI of a person
 * take weight and height as the input and print the state of health
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight in Kg's :");
        double w = sc.nextDouble();
        System.out.println("Please enter your height in meter :");
        double h = sc.nextDouble();
        double bmi = (w/(h*h));
        // double bmi = 17;
        String ans = (bmi >= 18 ? (bmi <= 22 ? "Fit" : "obese") : "malnourished");

        System.out.println("your are "+ans);
        sc.close();
    }
}
