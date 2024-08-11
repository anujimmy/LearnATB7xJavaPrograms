package ex_July142024;

public class Lab054 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // AB -> characters
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 66);
//        the program takes the larger container & some rules are skewed.
//        for e.g char + char = int
        char a2 = 65;
        System.out.println(a2); //char characters are actually integers
    }
}
