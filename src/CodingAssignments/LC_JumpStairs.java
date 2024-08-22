package CodingAssignments;
import java.util.Scanner;

public class LC_JumpStairs {
    public long climbStairs(int n){
        long[] stairs = new long[n+1];
        stairs[0] = 1;
        stairs[1] = 1;

        for (int i = 2; i < stairs.length; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LC_JumpStairs js = new LC_JumpStairs();
        System.out.println("No of ways to reach top - " + js.climbStairs(n));
    }
}
