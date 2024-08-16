package ex_Aug102024.Encapsulation;

public class Lab179 {
    public static void main(String[] args) {
        VWOLogin1 vwo = new VWOLogin1("admin","password123");
        System.out.println(vwo.getUsername());
        vwo.setUsername("pramod123");
        System.out.println(vwo.getUsername());
        vwo.setPassword("123456",true);
    }
}

class VWOLogin1{
    //data members
    private String username;
    private String password;

    public VWOLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAuth) {
        if(isAuth){
            this.password = password;
        }else{
            System.out.println("Not allowed !!");
        }
    }
}
