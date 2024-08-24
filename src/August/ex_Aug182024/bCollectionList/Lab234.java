package August.ex_Aug182024.bCollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
        List <String> family = new ArrayList();

        family.add("anu");
        family.add("jinu");
        family.add("noel");
        family.add("tino");
        family.add("thomas");
        System.out.println("----Method 1 to print using for each---------");
        for(Object o: family){
            System.out.println(o);
        }
        System.out.println("----Method 2 to print using for -------------");
        for (int i = 0; i < family.size(); i++) {
            System.out.println(family.get(i));
        }
        System.out.println("----Method 3 to print using iterator -------------");
        Iterator<String> its = family.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }
    }
}
