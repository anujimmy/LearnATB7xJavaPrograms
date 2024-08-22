package August.ex_Aug042024.singleInheritance;

public class Lab172 {
    public static void main(String[] args) {
        Son s = new Son();
        s.bhk3();
        s.bhk2(); // can work only if Son extends Father

        Father f = new Father();
        f.bhk2();
//        f.bhk3(); - this cannot happen as Father is first & gives everything to Son. He cant use reverse
    }
}
