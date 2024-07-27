package ex_27072024_Arrays_StringBuilderStringBuffer;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        //Arrays -> new
        int [] marks = new int[3];
        // 3 is the length - index from 0 to 2.
        System.out.println(marks[0]); //default value is 0
        marks[0] = 91;
        marks[1] = 71;
        marks[2] = 81;
        Scanner sc = new Scanner(System.in);
        marks[2] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        System.out.println(marks[10]);//AIOB EXCEPTION
        boolean[] is_married = {true, false, true};
        // To Print

        for (int i = 0; i < marks.length; i++) {
            // i = 0,1,2
            System.out.println(i + " -> " + marks[i]);
        }
        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }
    }
}
