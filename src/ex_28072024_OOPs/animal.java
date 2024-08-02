package ex_28072024_OOPs;

public class animal {
    String name;
    String color;

    void walk(){};
    void talk(){};

    public static void main(String[] args) {
        animal aniRef1 = null;
        /*aniRef1.name = "dog";
        aniRef1.color = "black";*/
        animal aniRef2 = new animal();
        animal aniRef3 = new animal();
        animal aniRef4 = aniRef2;
        System.out.println(aniRef2.name);

    }
}
