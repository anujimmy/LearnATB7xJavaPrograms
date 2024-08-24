package August.ex_Aug182024.aExceptionPassingEx;



public class Lab222_throw_customException {
    public static void main(String[] args) throws Exception, ArithmeticException, NullPointerException {
        Bank sbi = new Bank("INR",1000);
        Bank icici = new Bank("INR",100);
        Integer totalnew = 0;

        Integer total = sbi.add(icici);
        System.out.println(total);

        Bank jpmorgan = new Bank("USD",850);
        Bank hsbc = new Bank("USD",150);

        totalnew = jpmorgan.add(hsbc);
        System.out.println("USD - " + totalnew);


        totalnew = sbi.add(jpmorgan);
        System.out.println("INR - "+ totalnew);


    }
}
