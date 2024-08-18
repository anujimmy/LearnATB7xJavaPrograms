package ex_Aug102024.Polymorphism.MethodOverloading;

public class Lab181 {
    //polymorphism
    //compile time/static polymorphism or method overloading
    //run time /dynamic poly/method overriding
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int res = m.add(3,4);
        double res2 = m.add(3.5,7.8);
        String res3 = m.add("anu", "jimmy");
        int res4 = m.add(2,4,5);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
