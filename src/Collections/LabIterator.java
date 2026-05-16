package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LabIterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Sunil");
        list.add("Bhati");
        list.add("Diya");
        list.add("Hinal");
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        Iterator itr = list.iterator();
        while (itr.hasNext()) { // to list out all the values from the list or array list
            System.out.println(itr.next());
        }

    }
}
