package CodingAssignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C1_CountVowelsNConsonants {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter any text");
        String strIp  = SC.nextLine();

        int [] outputArr = new int[2];
        outputArr = countyourVowels(strIp);
        System.out.println("no of vowels = "+ outputArr[0]);
        System.out.println("no of consonants = "+ outputArr[1]);
    }
    public static int[] countyourVowels(String ipStr){
        int iVowel = 0;
        int iConsonant = 0;
        int [] outArr = new int[2];
        for (int i = 0; i < ipStr.length()-1; i++) {
            char ichar = ipStr.toLowerCase().charAt(i);
            if (ichar == 'a' || ichar == 'e'|| ichar == 'i' ||ichar == 'o' || ichar == 'u'){
                iVowel +=1;
            }else{
                iConsonant +=1;
            }
        }
        outArr[0] = iVowel;
        outArr[1] = iConsonant;
        return outArr;
    }
}



