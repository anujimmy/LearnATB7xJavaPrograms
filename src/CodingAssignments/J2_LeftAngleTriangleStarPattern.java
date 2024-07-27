package CodingAssignments;

import java.util.Scanner;

public class J2_LeftAngleTriangleStarPattern {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows in the Triangle");
        int noOfRows = sc.nextInt();

        for (int i = noOfRows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
