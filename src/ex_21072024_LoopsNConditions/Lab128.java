package ex_21072024_LoopsNConditions;

public class Lab128 {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            i++;
            System.out.println(i + " inside while");
//            System.out.println("Pramod"); //never do this without exit condition
            if(i >5){
                break;
            }
            System.out.println("outside if");
        }
        System.out.println("outside while");
    }
}
