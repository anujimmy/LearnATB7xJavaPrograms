package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        int itemcode = 007;
        switch ( itemcode){
            case 001,002,003 -> System.out.println("electronic gadget");

            case 007 -> System.out.println("007");

            case 004,005,006-> System.out.println("manual gadget");

            default -> System.out.println("not in list");

        }
    }
}
