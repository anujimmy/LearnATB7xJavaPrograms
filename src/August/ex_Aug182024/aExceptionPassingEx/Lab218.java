package August.ex_Aug182024.aExceptionPassingEx;

public class Lab218 {
    public static void main(String[] args) {
        extracted1();
    }
    public static void extracted1(){
        extracted();
    }
    public static void extracted(){
        try {
            Integer [] a = new Integer[1];
            System.out.println(a[2]);
        } catch (Exception e) {
            System.out.println("Exception message is "+ e.getMessage());
            System.out.println("array out of bounds exception - child to parent to ..until main is found.");
        } finally {
            System.out.println("close the open connections objects etc");
            System.out.println("End of Program");
        }
    }
}
