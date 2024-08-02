package CodingAssignments;

import java.util.Scanner;

public class C1_FindDuplicateCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        String s = sc.nextLine();
        char [] arrChar = s.toLowerCase().toCharArray();
        int iDuplicate = 0;
        boolean isNotDuplicate = false;

        for (int i = 0; i < s.length() ; i++) {
            boolean isDuplicate = false;
            for (int j = i+1; j < s.length(); j++) {
                if(s.toLowerCase().charAt(i) == arrChar[j]){
                    isDuplicate = true;
                    iDuplicate+=1;
                    break;
                }
            }
            if (isDuplicate){
                System.out.print(s.toLowerCase().charAt(i) + " ");
                isNotDuplicate = true;
            }
        }
        if (!isNotDuplicate){
            System.out.println("No duplicates are found !!");
        }else{
            System.out.printf("%nno of duplicate characters = %d", iDuplicate);
        }
    }
}
