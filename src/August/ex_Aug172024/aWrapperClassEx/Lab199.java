package August.ex_Aug172024.aWrapperClassEx;

public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
//        A a2 = new A();

        a.age =  12;
        System.out.println(A.discount);
        a.m2();
        A.m1(); // Static

        // Static don't need object ref. - True

    }

}

class A{
    int age  = 10; // Instance variable
    static int discount = 199; // static variable

    // SIB - STATIC initialization block - called only once per class
    static {
        System.out.println("One Time Load SIB");
    }

    // IIB - instance initialization block - whenever an object os created
    {
        System.out.println("IIB When Object is created");
    }

    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
        System.out.println(discount);
    }
}
