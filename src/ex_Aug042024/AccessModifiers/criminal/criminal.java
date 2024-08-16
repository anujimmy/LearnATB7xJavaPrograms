package ex_Aug042024.AccessModifiers.criminal;

import ex_Aug042024.AccessModifiers.Police.Cop;

public class criminal {
    public static void main(String[] args) {
        Cop c = new Cop(6,"1ABC");
        // - will not work when its protected or private.
//        c.bullet = 100;
//        c.ID = "2DEF";
//        c.plsShoot();

    }
}
