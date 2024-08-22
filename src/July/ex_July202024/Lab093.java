package July.ex_July202024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {

        //to select browser

        Scanner sc = new Scanner(System.in);
        System.out.println("enter browser name");
        String br_name = sc.nextLine().toLowerCase();

        switch(br_name){
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            case "chrome":
                System.out.println("starting the chrome browser");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                break;
            default:
                System.out.println("not handled in this framework");
                break;
        }

    }
}
