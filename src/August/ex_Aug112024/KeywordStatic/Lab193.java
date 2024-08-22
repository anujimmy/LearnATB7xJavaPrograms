package August.ex_Aug112024.KeywordStatic;

public class Lab193 {
    public static void main(String[] args) {
        System.out.println(ATB.courseName);
        ATB.doAssignment();

        ATB a1 = new ATB("Anu",123456789L);

    }
}

class ATB{
    {
        System.out.println("2nd IIB - Instance Instantiation block - object is created");
        //code to start website or anything before starting
        //web automation or API automation
    }
    private String name;
    private Long phone;
    static String courseName = "ATB7X";

    public ATB(String name,Long phoneNo){
        System.out.println("3rd Constructor is called - inside PC");
        this.name = name;
        this.phone = phoneNo;
    }
    static{
        System.out.println("1st I am executed -  I Load the class");
    }
    static void doAssignment(){
        System.out.println("Do assignment");
    }

    public String getName() {
//        System.out.println(this.name + " is returned");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
//        System.out.println(this.phone + " is returned");
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    static class A{

    }
}