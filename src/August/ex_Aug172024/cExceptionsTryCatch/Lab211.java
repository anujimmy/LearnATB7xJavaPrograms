package August.ex_Aug172024.cExceptionsTryCatch;

public class Lab211 {
    public static void main(String[] args) {
        int c = 2;
        try {
            c = 10/c;
        } catch (Exception e) {
            System.out.println("/ by zero !! pls check");
            throw new RuntimeException(e);
        }
        System.out.println(c);
        System.out.println("End");
    }
}
