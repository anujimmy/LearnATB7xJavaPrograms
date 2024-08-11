package ex_July202024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //Switch
//    Day name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day num 1 to 7");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea - pls check ip");
        }
        System.out.println("Outside switch case");
    }
}
