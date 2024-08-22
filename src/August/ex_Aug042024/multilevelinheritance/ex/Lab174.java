package August.ex_Aug042024.multilevelinheritance.ex;

public class Lab174 {
    public static void main(String[] args) {
//        Multilevel inheritance
//        GF -> F -> Child
        Child c = new Child("anu","jimmy","zack");
        c.print();
        c.name_c = "abc";
        c.name_f = "def";
        c.name_gf = "ghi";
        c.print();
        c.home();
        c.name();
        c.old();
    }
}
