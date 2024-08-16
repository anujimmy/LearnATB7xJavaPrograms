package ex_Aug042024.multipleInheritanceNotAllowed;

public class Child extends Father{
//    public class Child extends Father,Mother{ - classes cannot extend multiple classes
    void c(){
        home();
        money();
    }
}
