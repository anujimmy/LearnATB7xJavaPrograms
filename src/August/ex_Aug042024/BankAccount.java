package August.ex_Aug042024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;
    //default constructor
    BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    // PC - 3 Argument
    BankAccount(String bName,int bal, String bCode){
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }

    void printbankdetails(){
        System.out.println("name -> "+ bankName);
        System.out.println("balance -> "+ balance);
        System.out.println("bankcode -> "+ bankCode);
    }
}
