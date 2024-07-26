package CodingAssignments;

import java.util.Scanner;

public class J1_FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for FizzBuzz");
        int num1 = sc.nextInt();
        System.out.println("----Output----");
        for (int i = 1;i<=num1;i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
