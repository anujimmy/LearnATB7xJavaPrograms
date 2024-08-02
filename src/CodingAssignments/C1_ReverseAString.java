package CodingAssignments;

import java.util.Scanner;

public class C1_ReverseAString {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        StringBuilder ipStrBuilder = new StringBuilder(SC.next());
        StringBuilder opRevStr  = new StringBuilder();
        System.out.println("input is " + ipStrBuilder);

        int StrLen = ipStrBuilder.length();

        for (int i = StrLen-1; i >=0 ; i--) {
            opRevStr.append(ipStrBuilder.charAt(i));
        }
        if(ipStrBuilder.toString().equals(opRevStr.toString())) { //ipStrBuilder == opRevStr //ipStrBuilder.equals(opRevStr)
            System.out.printf("String : %s is a palindrome",ipStrBuilder);
        }else{
            System.out.printf("String : %s is not a palindrome",ipStrBuilder);
        }

       /* if(ipStrBuilder.compareTo(opRevStr) == 0) { //ipStrBuilder == opRevStr //ipStrBuilder.equals(opRevStr)
            System.out.printf("String : %s is a palindrome",ipStrBuilder);
        }else{
            System.out.printf("String : %s is not a palindrome",ipStrBuilder);
        }*/
        SC.close();
    }
}
