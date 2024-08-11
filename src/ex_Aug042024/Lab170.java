package ex_Aug042024;

import java.util.Scanner;

public class Lab170 {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        /*System.out.println(sbi.bankName);
        System.out.println(sbi.balance);
        System.out.println(sbi.bankCode);*/
        sbi.printbankdetails();
        System.out.println("-------------------------yes");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank cODE!");
        String bCode = sc.next();
        BankAccount banki = new BankAccount(bName,bal,bCode);
//        BankAccount banki = new BankAccount("ICICI",100,"ICICI0000");
        banki.printbankdetails();
        /*System.out.println(banki.bankName);
        System.out.println(banki.balance);
        System.out.println(banki.bankCode);*/
        sc.close();
    }
}
