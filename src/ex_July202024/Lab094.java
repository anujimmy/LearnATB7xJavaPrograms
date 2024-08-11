package ex_July202024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
//        vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character, i will update it as vowel or consonant");
        char input = sc.next().charAt(0);
        switch(input){
            case 'a','e','i','o','u': // --> possible if JDK > 13.
                System.out.println("Vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }
    }
}
