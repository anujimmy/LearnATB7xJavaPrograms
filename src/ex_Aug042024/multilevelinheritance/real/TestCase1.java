package ex_Aug042024.multilevelinheritance.real;

public class TestCase1 extends BaseTest{

    void testcase1(){
        StartBrowser();
        //here is the code for test case
        getDataFromSQL(); // --> comes from frandbasetest
        CloseBrowser();
        System.out.println(gold);
    }

    public static void main(String[] args) {
        new TestCase1().testcase1();
    }
}
