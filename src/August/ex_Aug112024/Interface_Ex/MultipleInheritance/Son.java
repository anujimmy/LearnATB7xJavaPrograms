package August.ex_Aug112024.Interface_Ex.MultipleInheritance;

public class Son implements Father,Mother {

    @Override
    public void Loan() {
        System.out.println("sons implementation of Loan");
    }

    @Override
    public void Home() {
        System.out.println("sons implementation of home");
    }

    @Override
    public void money() {
        System.out.println("sons implementation of money");
    }
}
