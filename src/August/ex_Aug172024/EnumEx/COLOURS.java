package August.ex_Aug172024.EnumEx;

public enum COLOURS {
    RED("#ff000d0d"),
    WHITE("#f0d0d0d"),
    YELLOW("#f0d0d0d");

    private final String hexValue;

    COLOURS(String hexValue) {
        this.hexValue = hexValue;
    }
    public String getValue(){
        return hexValue;
    }

}
