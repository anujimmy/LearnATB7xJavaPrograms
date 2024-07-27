package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        //JDK >13
        int itemcode = 005;
        switch ( itemcode){
            case 001,002,003:
                System.out.println("electronic gadget");
                break;
            case 007 :
                System.out.println("007");
                break;
            case 008,009:
                System.out.println("error here");
                break;
            case 004,005,006:
                System.out.println("manual gadget");
                break;
            default:
                System.out.println("not in list");
                break;
        }
    }
}
