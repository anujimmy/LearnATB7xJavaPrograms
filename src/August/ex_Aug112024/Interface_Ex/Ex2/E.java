package August.ex_Aug112024.Interface_Ex.Ex2;

public interface E {
    void startEngine();
    void StopEngine();
    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }
    void m2();
    void m3();
//   void m4(){
//       System.out.println("Not possible");
//   }
}
