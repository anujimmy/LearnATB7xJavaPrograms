package August.ex_Aug112024.Abstract_Ex.exLoan;

public class Lab188 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan25k();
        s1.loan50k();

        int loanamt = s1.getLoanamount();

        Father s2 = new Son(); //dynamic dispatch
        s2.loan25k();
        s2.loan50k();
    }
}
