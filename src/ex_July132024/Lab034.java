package ex_July132024;

public class Lab034 {
    public static void main(String[] args) {
        char C1 = '\n';// New line / Next Line
        System.out.println("Start");
        System.out.println(C1);
        System.out.println("Stop");
        String A = "noel";
        String B = "tino";
        String C = "thomas";
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word
        System.out.println(A + c1 + B+ c1 + C);
        System.out.println(A + c2 + B+ c2 + C);
        System.out.println(A + c3 + B+ c3 + C);
        A = "illa";
        char c4 ='\\';
        char c5 = '\'';
        char c6 = '\"';
        System.out.println(A + c4 + B+ c5 + C+ c6);
    }
}
