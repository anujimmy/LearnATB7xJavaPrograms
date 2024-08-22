package July.ex_July142024;

public class Lab056_CASTING {
    public static void main(String[] args) {
        byte b = 10;
        int a = (int) b; //Implicit casting by JVM - int is faded -> redundant or not useful.
        int a1 = (int) b; //VALID - Explicit casting
//        this is called as WIDENING - process of converting lower type to higher type

        int val = 300;
//        byte b1 = val; //implicit casting JVM is not possible
//        Narrowing  - not possible
        byte b1 = (byte)val; // LOSS of DATA - EXPLICIT CASTING -
//        from right 8 bits will be taken after converting val to bits
//        300 ->100101100 ba ->00101100 = 44(4+8+32)
        System.out.println(b1);

        long b3 = val;
        System.out.println(b3);

    }
}
