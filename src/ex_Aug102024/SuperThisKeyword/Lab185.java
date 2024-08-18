package ex_Aug102024.SuperThisKeyword;

public class Lab185 {
    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC

    // this()
    // this.variableName
    public static void main(String[] args) {

        Person1  p = new Person1("p");

    }
}

class Person1 {
    int abc = 20;
    Person1() {
        System.out.println("Person1 - DC");
    }

    Person1(String a) {
        this();
        System.out.println("Person1 - PC A1");
    }

    Person1(String a, int a1) {
        System.out.println("Person1  - PC A2");

    }
}
class Student1 extends Person1{
    int abc = 10;
    Student1(String s){
        System.out.println("PC -Student");
    }

    Student1(){
        super();
        System.out.println(this.abc);
        System.out.println(super.abc);
        //super("Pramod");
        //super("pramod",12);
    }


}