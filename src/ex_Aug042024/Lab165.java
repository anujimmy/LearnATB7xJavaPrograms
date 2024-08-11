package ex_Aug042024;

public class Lab165 {

        int e= 45; // Instance Variable != Global Variable

    void f1(){
        int e = 10; // Local Variable
        double pi = 3.14f;
        System.out.println(e);
    }
    //        System.out.println(pi); // pi oos to be
    void f2(int e){
        e = 50;
        System.out.println(e);

    }

    }

