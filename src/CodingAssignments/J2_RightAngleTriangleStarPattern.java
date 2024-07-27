package CodingAssignments;

import java.util.Scanner;

public class J2_RightAngleTriangleStarPattern {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows in the Triangle");
        int noOfRows = sc.nextInt();

        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
