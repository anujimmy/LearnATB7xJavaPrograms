package July.ex_July202024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int n = sc.nextInt();
        if ( n%2==0 ){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
