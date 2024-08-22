package August.ex_Aug102024.Encapsulation;

public class Lab180 {
    public static void main(String[] args) {
        Bank anu = new Bank("Anu",1000);
        anu.setBal(false,100000);
        System.out.println("User name is = "+ anu.getUserName());
        System.out.println("balance is =" + anu.getBal(false));

        Bank admin = new Bank("admin",0);
        boolean IsAdmin = true;
        admin.setBal(IsAdmin,0001000000);
        System.out.println("User name is = "+ admin.getUserName());
        System.out.println("balance is =" + admin.getBal(IsAdmin));
    }



}
