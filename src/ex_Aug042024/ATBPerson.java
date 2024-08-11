package ex_Aug042024;

public class ATBPerson {
    String name;
    long phone;

    // DC
    ATBPerson() {
        System.out.println("Object is created!");
    }

     ATBPerson(String nameGiven){
        this.name = nameGiven;
        // This current class.
    }
    ATBPerson(String nameIn, long PhoneIn){
        this.name = nameIn;
        this.phone = PhoneIn;
    }

}
