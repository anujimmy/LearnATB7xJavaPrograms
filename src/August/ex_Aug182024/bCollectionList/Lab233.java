package August.ex_Aug182024.bCollectionList;

import java.util.ArrayList;
import java.util.List;

public class Lab233 {
    public static void main(String[] args) {
        List <Integer> l = new ArrayList<Integer>();
        List <Integer> l1 = new ArrayList<Integer>();
        l.add(89);
        l.add(65);
        l.add(87);
        l1.add(895);
        l1.add(656);
        l1.add(876);
        l.addAll(l1);
        System.out.println(l);



    }

}
