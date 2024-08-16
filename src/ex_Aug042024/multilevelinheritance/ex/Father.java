package ex_Aug042024.multilevelinheritance.ex;

public class Father extends Grandfather {
    String name_f;
    void home(){
        System.out.println("2BHK");
    }
    /*void name(){
        System.out.println("Father is here");
    }*/
    void extra(){
        System.out.println("Extra home for rent!!!");
    }
}
