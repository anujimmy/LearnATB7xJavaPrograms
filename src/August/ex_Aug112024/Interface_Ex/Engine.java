package August.ex_Aug112024.Interface_Ex;

public interface Engine {
    int maxspeed = 0;
    int nofofGears = 5;
    void startEngine(); //incomplete


    void stopEngine();
    static void display(){
        System.out.println("Max Speed - " + maxspeed);
        System.out.println("no of Gears - "+ nofofGears);
    }
}
