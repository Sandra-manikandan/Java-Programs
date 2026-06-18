package JDBC;

import java.util.ArrayList;


public class Duplicate {

    Duplicate(ArrayList<Integer> list) {

      //  HashSet<Integer> set=new HashSet<>(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("List: "+ list);
        //System.out.println(set);
    }
}
