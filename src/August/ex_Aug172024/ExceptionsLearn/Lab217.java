package August.ex_Aug172024.ExceptionsLearn;

public class Lab217 {
    public static void main(String[] anu) {

        int a = 0;
        try {
            int x = 10/a; // unchecked arithmetic exception
        } catch (Exception jimmy) {
            System.out.println("div by zero");
        } finally {
            System.out.println("I will be executed anyhow !!");
        }

    }
}
