package ex_27072024_Arrays_StringBuilderStringBuffer;

public class Lab143 {
    public static void main(String[] args) {
        final float pi =  3.14F;

        // Disadvantage of array
        //1. Fixed Data Type (homo)
        //2.  Fixed Length.
        // 3. wastage of memory
        int [] ages = new int[100];
        ages[1]  = 99;
        ages[1]  = 100;
        System.out.println(ages[1]); // 0 99 00000000...
// a[0] = 0 ,a[1] = 99 rest are zero.
    }
}
