package ex_21072024_LoopsNConditions;

public class Lab121 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if(i%2==0){
                System.out.println(i + " is Even");
            }
        }
        for (int i = 0; i <= 50; i++) {
            if(i%2!=0){
                System.out.println(i + " is not Even");
            }
        }
    }
}
