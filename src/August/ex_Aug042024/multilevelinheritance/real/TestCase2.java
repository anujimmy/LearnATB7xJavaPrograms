package August.ex_Aug042024.multilevelinheritance.real;

public class TestCase2{


    // since we are not extending we need to do it like this.
    void testcase2(){
        new BaseTest().StartBrowser();
        //here is the code for test case
        new GrandBaseTest().getDataFromSQL();
        new BaseTest().CloseBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testcase2();
    }
}
