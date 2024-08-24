package August.ex_Aug182024.aExceptionPassingEx;

import java.util.Scanner;

public class Lab223 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner("System.in");
        String name = sc.next();
        System.out.println("Enter your name");
        if (name.equalsIgnoreCase("Anu")){
            try{
                System.out.println("Exception value passed");
            } catch (Exception e) {
                throw new Exception("Not allowed !!");
            }
        }else{
            System.out.println("Allowed");
        }

    }
}
