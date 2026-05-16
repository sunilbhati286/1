package Collections;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList arylist = new ArrayList();
        arylist.add("Sunil");
        arylist.add("Bhati");
        arylist.add("Bhati"); // Dupicate will be allowed
        arylist.add(45);
        System.out.println(arylist);
        System.out.println(arylist.size());
    }
}
