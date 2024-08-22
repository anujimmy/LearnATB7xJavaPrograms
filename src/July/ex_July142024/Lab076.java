package July.ex_July142024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        //String s1 = "P r a m o d";
        //          |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        s1.concat("Dutta"); // Pramod Dutta - > creates new string in SCP however the s1 still points to Pramod
        System.out.println(s1);
        String s2 =  s1.concat("Dutta");
        System.out.println(s2);
    }
}
