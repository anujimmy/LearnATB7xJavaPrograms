package August.ex_Aug112024.Abstract_Ex.exLoan;

abstract class Father {
    int loan_amount = 5000;
    abstract void loan50k();

    void loan25k(){
        System.out.println("completed & closed by father");
    }
    public int getLoanamount(){
        return this.loan_amount;
    }
}
