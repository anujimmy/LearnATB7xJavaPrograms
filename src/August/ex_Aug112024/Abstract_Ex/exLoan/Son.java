package August.ex_Aug112024.Abstract_Ex.exLoan;

public class Son extends Father{

    int loanamt = super.getLoanamount();

    @Override
    void loan50k() {
        System.out.println("Son will repay 50k loan");
    }

}
