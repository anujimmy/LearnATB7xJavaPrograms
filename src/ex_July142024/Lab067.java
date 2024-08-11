package ex_July142024;

public class Lab067 {
    public static void main(String[] args) {
        String name = "Jimmy";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Jimmy Zacharias");
        // How many ways we can a String - 2
        // = , new operator -> creates in SCP (String const pool)
        // new - Objects(heap)
        //System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.concat(" Zacharias"));
        System.out.println(name);
        System.out.println(name.compareTo(name2));
        System.out.println(name.charAt(4));
        System.out.println(name.toUpperCase());
    }
}
