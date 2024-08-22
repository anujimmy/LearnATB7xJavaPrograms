package July.ex_July202024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Please vote");
        }else{
            System.out.println("less than legal age for voting18");
        }


    }
}
