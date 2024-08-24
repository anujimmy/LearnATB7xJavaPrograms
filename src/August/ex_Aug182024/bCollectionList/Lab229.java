package August.ex_Aug182024.bCollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Lab229 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 4){
                System.out.println("found 4");
                break;
            }
        }

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("Arraylist is " + arr);
        System.out.println("item 0" + arr.get(0));
        System.out.println("Size is "+ arr.size());
        arr.set(4,",");
        System.out.println("new element is " + arr.get(4));
        for (Object i : arr){
            System.out.println("Object - "+  i);
        }
        System.out.println("First element - "+ arr.getFirst());
        System.out.println("Last element - "+ arr.getLast());

    }
}
