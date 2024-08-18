package ex_Aug102024;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1();
        t1.setBrowser("edge",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}

class TestCase1 extends BaseClass{
    TestCase1(){
        super();
        //this.setBrowser("edge",true);
    }
    @Override
    public void setBrowser(String browser, boolean IsAuth){
        super.setBrowser(browser,IsAuth);
    }
}

class BaseClass{

    BaseClass(){
        System.out.println("DC - BaseClass");
    }
    BaseClass(String a){
        System.out.println("PC - BaseClass");
    }
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean IsAuth) {
        if(IsAuth){
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }
    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}
