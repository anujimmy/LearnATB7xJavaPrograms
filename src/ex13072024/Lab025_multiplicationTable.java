package ex13072024;

public class Lab025_multiplicationTable {
    public static void main(String[] args) {
        String name = "Anu Jimmy";
        String surname  = "Thomas";
        System.out.printf("Your name is -> %s %s",name,surname);
        System.out.println();
        int num = 9;
        for (int i=1;i<=12;i++){
            System.out.printf("%d * %d = %d\n",num,i,(num*i));
//            System.out.println();
        }
    }
}
