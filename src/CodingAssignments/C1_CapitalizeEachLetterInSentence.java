package CodingAssignments;
import java.util.Scanner;

public class C1_CapitalizeEachLetterInSentence {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String ipString = SC.nextLine();
        String[] strSplit = ipString.split(" ");
//        System.out.println("Length -> "+ strSplit.length);
        String[] strNew = new String[strSplit.length];
        String FirstLetter, restString;

        for (int i = 0; i <strSplit.length ; i++) {
            FirstLetter = strSplit[i].toString().substring(0,1).toUpperCase();
            restString = strSplit[i].toString().substring(1, strSplit[i].length());
            strNew[i] = FirstLetter + restString;
            System.out.println( strNew[i]);
        }

    }
}
