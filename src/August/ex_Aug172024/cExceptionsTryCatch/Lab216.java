package August.ex_Aug172024.cExceptionsTryCatch;

public class Lab216 {
    public static void main(String[] anu) {

        int a = 0;
        try {
            int x = 10/a;
        } catch (Exception jimmy) {
            System.out.println("div by zero");
        } finally {
            System.out.println("I will be executed anyhow !!");
        }

    }
}
