package ex_28072024_OOPs;

public class Lab154 {
    public static void main(String[] args) {
        // OOPs - Concept
        // Real life problem -> OOPs concepts
        // Creating - New planet
        //  AHuman
        //  Attributes / properties -> 2 hand, eye color, node, mouth, height, wieght, body color, hair color
        // Behaviour / methods -> walk(), eat(), talk(), read(), sleep(), hear().

        // Amit - AHuman
        // A ->  Amit
        // B ->

        //  Blueprint - Class - Person
        Person p1 = new Person();
        p1.name = "Anu";
        p1.gender = 'F';
        p1.rollno = 3531;

        Person p2 = new Person();
        p2.name = "Noel";
        p2.gender = 'M';
        p2.rollno = 0;

        System.out.println( p1.rollno + ", "+ p2.rollno);
    }
}
