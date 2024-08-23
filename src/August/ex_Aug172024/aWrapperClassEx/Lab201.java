package August.ex_Aug172024.aWrapperClassEx;

public class Lab201 {
    public static void main(String[] args) {
        OC o = new OC();
        OC.InnC ic = o.new InnC();
        int sum = o.a + ic.b;
        System.out.println(sum);
    }

}

class OC{
    Integer a = 10;
    void OC_m1(){
        System.out.println("OC_M10");
    }
    static class P{

    }
    class InnC{
        Integer b= 20;
        void IC_m2(){
            System.out.println(a);
            System.out.println("IC_M2");
        }
    }
}