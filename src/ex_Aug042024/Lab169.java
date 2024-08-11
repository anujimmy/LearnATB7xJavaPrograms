package ex_Aug042024;

public class Lab169 {

    public static void main(String[] args) {
        ATBPerson a0 = new ATBPerson();
        System.out.println(a0.name);
        System.out.println(a0.phone);
        ATBPerson a1 = new ATBPerson("Anu");

        System.out.println(a1.name);
        System.out.println(a1.phone);
        ATBPerson a2 = new ATBPerson("Jimmy");
        System.out.println(a2.name);
        System.out.println(a2.phone);
        ATBPerson a3 = new ATBPerson("Noel",9847456789L);
        System.out.println(a3.name);
        System.out.println(a3.phone);
    }
}
