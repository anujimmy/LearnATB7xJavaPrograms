package August.ex_Aug172024.WrapperClassEx;

public class Lab196 {
    public static void main(String[] args) {
        //Primitive to Wrapper class
        int a = 10;
        Integer b = a;
        //Integer.maxvalue
        System.out.println(a);
        System.out.println(b); //extra utilities are added.

        //Wrapper class to Primitive
        Integer a2 = 42; //Auto boxing -> int is always converted to Integer.
        int val = a2;    //UnBoxing -> Integer to int
        System.out.println(a2);
        System.out.println(val);

    }


}
