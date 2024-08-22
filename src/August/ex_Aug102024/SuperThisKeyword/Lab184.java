package August.ex_Aug102024.SuperThisKeyword;

public class Lab184 {
    public static void main(String[] args) {
      /*  Student s = new Student();
        s.display();
        s.message();*/

        Person p = new Person();
        p.message();

        Person p1 = new Student();
        p1.message();
    }
}

class Student extends Person{

    @Override
    void message(){
        System.out.println("I am a student message");
    }
    void display(){
        System.out.println("in Student or child class");
        this.message();
        System.out.println("-----------");
        super.message();
    }
}

class Person{

    void message(){
        System.out.println("I am a person message");
    }
}
