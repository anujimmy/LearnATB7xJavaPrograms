package August.ex_Aug182024.bCollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Lab232 {
    public static void main(String[] args) throws Exception {
        List <Integer> marks = new ArrayList<Integer>();
        marks.add(91);
        marks.add(95);
        marks.add(65);
        marks.add(85);
        marks.add(84);

        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);

    }
}
