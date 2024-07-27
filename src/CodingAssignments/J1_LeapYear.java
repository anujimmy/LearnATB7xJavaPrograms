package CodingAssignments;

import java.util.Scanner;

public class J1_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year in YYYY format");
        int iYear  = sc.nextInt();
        // iYear %100 is needed for cases like 1800 or 1900
        // iYear %400 -> multiples of 4 & 100 like 2000
        if ((iYear % 4 ==0) && (iYear%100 !=0) || (iYear %400 ==0)){
            System.out.println(iYear + " is a leap year");
        }else {
            System.out.println(iYear + " is not a leap year");
        }
        sc.close();
    }
}
