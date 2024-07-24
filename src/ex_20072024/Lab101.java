package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are below: ");
        System.out.printf("Name : %s%n Age: %d%n Salary: %f%n",name,age,salary);

    }
}
