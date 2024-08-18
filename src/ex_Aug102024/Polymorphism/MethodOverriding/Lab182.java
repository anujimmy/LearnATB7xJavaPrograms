package ex_Aug102024.Polymorphism.MethodOverriding;

public class Lab182 {
    public static void main(String[] args) {
        /*Dog h = new Hound();
        h.bark();
        h.eat();*/
        int age_d = 10;
        Hound h1 = new Hound();
        h1.bark();
        h1.drink();

        Dog d = new Dog();
        d.bark();
//        d.drink();

        Dog d_ref = new Hound();
        d_ref.bark();
//        d_ref.drink();



    }
}
