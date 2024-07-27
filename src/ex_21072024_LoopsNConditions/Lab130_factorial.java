package ex_21072024_LoopsNConditions;

import java.util.Scanner;

public class Lab130_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int n = sc.nextInt();
        int i = n;
        long fact = 1;
        while (n >=1){
            fact = fact * n;
            n--;
        }
        /*for (int j = 1; j <=n ; j++) {
            fact = fact * j;
        }*/
        System.out.printf("Factorial of %d is %d",i,fact);
        sc.close();
    }
}
