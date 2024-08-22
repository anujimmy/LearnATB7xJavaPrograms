package August.ex_Aug042024.AccessModifiers.Police;

public class Cop {
    private int bullet;
    private String ID;

    public Cop(){
        System.out.println("Default constructor");
    }

    public Cop(int bullet, String ID){
        System.out.println("Constructor is called");
        this.bullet = bullet;
        this.ID = ID;
    }
    protected void plsShoot(){
        System.out.println("yes you can !!");
//        if(flag){
//            System.out.println("You can shoot - "+ this.bullet);
//        }else{
//            System.out.println("You can't shoot");
//        }
    }
}
