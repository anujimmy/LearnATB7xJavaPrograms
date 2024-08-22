package August.ex_Aug112024.Abstract_Ex.ReallifeEx;

public abstract class BaseClass extends GrandbaseClass {
    abstract void OpenBrowser(String browser);
    abstract void CloseBrowser(String browser);

    BaseClass(){} //no use as abstract class object cannot be created.

    @Override
    void takeScreenshot() {
        System.out.println("Take screenshot");
    }
}
