package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP
        // only 1 string is created - unique value only is kept
        System.out.println(name1 == name); //-> checks for reference
        System.out.println(name1.equals(name)); // -> checks for content

        String name2 = new String("The Testing Academy"); // Heap area (OA)
        String name3 = new String("The Testing Academy"); // Heap area (OA)
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name3));
    }
}
