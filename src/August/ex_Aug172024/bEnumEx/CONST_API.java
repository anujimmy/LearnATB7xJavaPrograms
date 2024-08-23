package August.ex_Aug172024.bEnumEx;

public enum CONST_API {
    BASE_URL("https://app.vwo.com"),
    LOGIN_URL("https://app.vwo.com/login"),
    DASHBOARD_URL("https://app.vwo.com/dashboard"),
    SUPPORT_URL("https://app.vwo.com/support");
    private final String URL;
    CONST_API(String URL){
        this.URL = URL;
    }
    public String getURL(){
        return URL;
    }
}
