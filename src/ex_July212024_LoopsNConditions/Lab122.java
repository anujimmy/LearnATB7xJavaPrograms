package ex_July212024_LoopsNConditions;

public class Lab122 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if( i == 5){
                continue;
            }
            if(i==8){
                break;
            }
            System.out.println("After!!");
        }
        System.out.println("Outside For Loop");
    }
}
