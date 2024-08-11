package ex_July142024;

public class Lab068 {
    public static void main(String[] args) {
        String name1 = "Anu"; // Assignment Operators -String constant pool
        String name2 = new String("Anu"); // New Operator - heap

        // Both of them, actually save the name, name2 in different ways JVM
        // How they store the values in the JVM?


        // SCP for new & Heap - JVM

        /*JVM has class loader.There is another area called as Heap & third area as String constant pool.
        * name1 & name2 looks same but the locations where they are stored is diferent.
        * Assignment operator creates in SCP or string const pool.
        * new creates in heap. So references or locations are different eventhough its same in content
        *
        *
        * Strings are IMMUTABLE - cant change the strings
        * */

    }
}
