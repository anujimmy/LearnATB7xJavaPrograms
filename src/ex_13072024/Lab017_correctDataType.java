package ex_13072024;

public class Lab017_correctDataType {
    public static void main(String[] args) {
        //max age of any person is 123 so we dont need to use int
        // a byte should be ok
        byte age = 122; //age not greater than 127 - > less memory -> smart container
        int age1 = 100;
        // program for pi with only 2 decimal
        float  pi = 3.14f;
        double dblNum = pi * 2 * 1.4444;

        System.out.println("2piR = " + dblNum);
    }
}
