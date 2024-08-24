package August.ex_Aug182024.bCollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab231 {
    public static void main(String[] args) {
        List l = new ArrayList() ;
        String ipStr;

        l.add("Jinu");
        l.add("Anu");
        l.add("Noel");
        l.add("Jimmy");
        l.add("pushpamma");
        l.add("pushpamma");
        l.add("pushpamma");

        System.out.println("list - " + l);
        System.out.println("size - "+ l.size());
        l.remove("pushpamma");
        l.sort(null);
        System.out.println("list after sort - " + l);
//        l.clear();
//        System.out.println("list after clearing - " + l);
//        System.out.println("size after clearing - "+ l.size());
//        System.out.println("is list empty - " + l.isEmpty());

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your family members, enter 'EXIT' to stop entry ");
        ipStr = sc.nextLine();
        while(! ipStr.equalsIgnoreCase("EXIT")){
                l.add(ipStr);
                ipStr = sc.nextLine();
        }*/
        System.out.println("list - " + l);
        System.out.println("size - "+ l.size());
        l.set(0,"maidaan");
        System.out.println("list - "+ l);
        l.remove(0);
        System.out.println("list - "+ l);
        System.out.println(l.indexOf("papa"));
        l.add(true);
        l.add(3.14);
        l.add(132145656);
        l.add(007);

//        for(Object o :l){
//            System.out.println(o);
//        }

        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + " - "+l.get(i));
        }

    }
}
