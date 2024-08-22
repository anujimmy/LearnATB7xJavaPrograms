package August.ex_Aug042024.multilevelinheritance.ex;

public class Child extends Father {
    String name_c;

    public Child( String name_c, String name_f,String name_gf ) {
        this.name_c =  name_c;
        this.name_f = name_f;
        this.name_gf = name_gf;
    }

    void home(){
        System.out.println("3 bhk");
    }
    /*void name(){
        System.out.println("Child is here");
    }*/
    void print(){
        System.out.println(name_c + " | " + name_f + " | " + name_gf );
    }
}
