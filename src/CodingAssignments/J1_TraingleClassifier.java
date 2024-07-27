package CodingAssignments;

import java.util.Scanner;

public class J1_TraingleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter length of side1");
        double s1 = sc.nextDouble();
        System.out.println("enter length of side2");
        double s2 = sc.nextDouble();
        System.out.println("enter length of side3");
        double s3 = sc.nextDouble();
        char Type = '0';
        boolean s12 = (s1 == s2);
        boolean s13 = (s1 == s3);
        boolean s23 = (s2 == s3);
        if(s12 && s13 && s23) {
            System.out.println("Equilateral Triangle");
        }else if (s12 || s13 || s23){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }
        sc.close();
    }
}
