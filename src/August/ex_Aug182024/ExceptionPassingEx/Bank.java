package August.ex_Aug182024.ExceptionPassingEx;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankname) throws Exception {
        if ((bankname.currency.equalsIgnoreCase(this.currency))) {
//        if ((bankname.currency.equalsIgnoreCase(this.currency)) &&  this.currency.equalsIgnoreCase("INR")) {
            Integer sum = this.amount + bankname.getAmount();
            return sum;
        }else{
            throw new Exception("Only INR is supported !!");
        }

    }
}
