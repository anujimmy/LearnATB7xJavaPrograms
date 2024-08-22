package August.ex_Aug112024.Abstract_Ex.ReallifeEx;

public class Lab189 {
    public static void main(String[] args) {
        Chrome c = new Chrome();
        c.OpenBrowser("chrome");
        c.CloseBrowser("chrome");
        c.takeScreenshot();

        Firefox f = new Firefox();
        f.OpenBrowser("firefox");
        f.CloseBrowser("firefox");
    }
}
