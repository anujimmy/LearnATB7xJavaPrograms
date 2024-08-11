package ex_July202024;

import java.util.Scanner;

public class Lab090_GradeCalculator {
    public static void main(String[] args) {//        ✅ Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your score");
        int score = sc.nextInt();

        char ch_grade ='O';

        if (score > 100 || score < 0) {
            System.out.println("Input Error! Please enter a score  <= to 100 or > 0");
        } else if (score >= 90 && score <= 100) {
            ch_grade = 'A';
        } else if (score >= 80 && score <= 89) {
            ch_grade = 'B';
        } else if (score >= 70 && score <= 79) {
            ch_grade = 'C';
        } else if (score >= 60 && score <= 69) {
            ch_grade = 'D';
        } else if (score >= 0 && score <= 59) {
            ch_grade = 'F';
        }else {
            ch_grade = 'F';
        }
        System.out.printf("Your Grade for score - %d is %c",score,ch_grade);
    }
}
