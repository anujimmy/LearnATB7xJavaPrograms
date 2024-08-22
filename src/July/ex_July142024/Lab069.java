package July.ex_July142024;

public class Lab069 {
    public static void main(String[] args) {
        String s1 = "anu";
        // 1 - SCP
        s1 = "jimmy";
        // 2 - SCP 2 strings are created s1 points to jimmy a newly created string
        s1 = "noel";
        // 3 . SCP 3 strings are created s1 points to noel a newly created string
        s1 = "anu";
        // 3, SCP 3 strings are created -> reused the first string s1 points to Anu again
    }
}
