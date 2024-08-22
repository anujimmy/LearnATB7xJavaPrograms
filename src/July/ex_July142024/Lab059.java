package July.ex_July142024;

public class Lab059 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicit Narrowing - JVM
        float total_price = course + GST; // Explicit narrowing - REAL time - money loss
        System.out.println(total_price);
    }
}
