package ex_July202024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("num is Zero");
        }

    }
}
